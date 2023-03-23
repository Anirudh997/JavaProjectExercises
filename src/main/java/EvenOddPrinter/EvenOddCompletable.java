package EvenOddPrinter;

import java.util.concurrent.CompletableFuture;

public class EvenOddCompletable {
    private static int count = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        EvenOddCompletable evenOddCompletable = new EvenOddCompletable();
        evenOddCompletable.evenOdd();
    }

    private void evenOdd(){
        //int count=1;
        CompletableFuture.runAsync(() -> {
            while (count < 10) {
                if(count%2==0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(count);
                }
                count++;
                notifyAll();
            }
        });

        CompletableFuture.runAsync(() -> {
            int count=1;
            while (count < 10) {
                if(count%2!=0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(count);
                }
                count++;
                notifyAll();
            }
        });
    }
}



