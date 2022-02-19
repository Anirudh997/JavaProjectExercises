package EvenOddPrinter;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        EvenOddPrint obj = new EvenOddPrint(num);
        Thread t1 =new Thread(() -> {
            obj.EvenPrint();
        });

        Thread t2 = new Thread(() -> {
            obj.OddPrint();
        });

        t1.start();
        t2.start();
    }
}
