package recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        //input number N.. returns 1+2+3...+N
        int val=3;

        //returns sum
        System.out.println(printSum(val));

        //returns factorial
        System.out.println(factSum(val));
    }

    private static int factSum(int val) {

        if(val==0){
            return 1;
        }
        return val*factSum(val-1);
    }

    private static int printSum(int val) {
        if(val==0){
            return 0;
        }
        return val + printSum(val-1);
    }
}
