package codingProbs;

import java.util.Arrays;

public class SecondSmallestNumber {
    /**
     * int secondSmallest(int[] x)
     */
    public static int secondSmallest(int[] x) {
        // Your code
        if(x.length==1){
            return x[0];
        }

        return Arrays.stream(x).sorted().limit(2).max().getAsInt();
    }

    public static void main(String args[]) {

        int[] a = { 0 };
        int[] b = { 0, 1 };

        boolean result = true;
        result &= secondSmallest(a) == 0;
        result &= secondSmallest(b) == 1;

        if (result) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
