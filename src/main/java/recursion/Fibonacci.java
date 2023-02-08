package recursion;

public class Fibonacci {
    public static void main(String[] args) {

        //Input num.. output fibnocci value

        int val=4;

        System.out.println(fib(val));
    }

    private static int fib(int val) {

        if(val<=1){
            return val;
        }
        return fib(val-1)+fib(val-2);
    }
}
