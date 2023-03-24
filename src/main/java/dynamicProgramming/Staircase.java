package dynamicProgramming;

public class Staircase {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    private static int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climb(n,dp);
    }

    private static int climb(int target,int[] dp){
        //Base case
        if(target<=0){
            if(target ==0)return 1;
            return 0;
        }

        if(dp[target]!=0)return dp[target];

        //Ways
        return dp[target] = climb(target - 1,dp) + climb(target -2,dp);

    }
}
