import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableExample {
    public static void main(String[] args) {
        //Simple way to use a run thread
        List<RunnableTask> taskList = new ArrayList<>();
        taskList.add(new RunnableTask());
        taskList.add(new RunnableTask());
        taskList.add(new RunnableTask());
        taskList.add(new RunnableTask());

        taskList.forEach(task -> CompletableFuture.runAsync(task));

        /*for(int i=0;i<5;i++) {
            CompletableFuture.runAsync(new RunnableTask());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        //CompletableFuture.runAsync(() -> System.out.println("Luffy")).thenCombine().CompletableFuture.runAsync(() -> System.out.println("KOP"));

        //Completed return value
        CompletableFuture<String> world = CompletableFuture.completedFuture("world");
        try {
            System.out.println(world.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }

    private static class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }
}
