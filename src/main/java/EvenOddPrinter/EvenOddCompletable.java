package EvenOddPrinter;

import java.util.concurrent.CompletableFuture;

public class EvenOddCompletable {
    private static int count = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        EvenOddCompletable evenOddCompletable = new EvenOddCompletable();
        evenOddCompletable.evenOdd();
    }

    private void evenOdd() {
        CompletableFuture<Void> evenTask = CompletableFuture.runAsync(() -> {
            synchronized (lock) {
                while (count < 10) {
                    while (count % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even: " + count);
                    count++;
                    lock.notify();
                }
            }
        });

        CompletableFuture<Void> oddTask = CompletableFuture.runAsync(() -> {
            synchronized (lock) {
                while (count < 10) {
                    while (count % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd: " + count);
                    count++;
                    lock.notify();
                }
            }
        });

        // Wait for both tasks to complete
        CompletableFuture.allOf(evenTask, oddTask).join();
    }
}



