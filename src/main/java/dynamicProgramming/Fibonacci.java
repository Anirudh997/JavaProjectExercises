package dynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        //Inputing val.. output the fibanocci val of it
        //Changing recursion to dynamic programming - Memoization method
        int val = 5;

        //1.declaring  separate array.. so we can store overalapping problems
        int[] dp= new int[10];
        Arrays.fill(dp,-1);
        System.out.println(fibn(val,dp));

        //Using tabulation
        System.out.println(fibt(val));
    }

    private static int fibt(int val) {
        int slast=1;
        int last=0;
        for(int i=2;i<=val;i++) {
            int cur = slast + last;
            last = slast;
            slast = cur;
        }
        return slast;
    }

    private static int fibn(int val, int[] dp) {
        if(val<=1){
            return val;
        }

        //3. chcking if the subproblem solution is already present.. so then we can use that instead of doing recursion again
        if(dp[val]!=-1)return dp[val];

        //2. adding all our subproblems in this array
        return dp[val]=fibn(val-1,dp)+fibn(val-2,dp);
    }
}
