import java.util.concurrent.CompletableFuture;

public class CompletableExample {
    public static void main(String[] args) {
        CompletableFuture.runAsync(()-> System.out.println("hello"));
    }
}
