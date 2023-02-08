package dynamicProgramming;

public class RodCutting {
    public static void main(String[] args) {
        System.out.println(cutRod(new int[]{2, 5, 7 ,8 ,10},5));
    }

    public static int cutRod(int price[], int n) {
        // Write your code here.

        //Memoization
        int[][] dp = new int[price.length][n+1];
        return cRod(price.length-1,n,price,dp);

    }

    private static int cRod(int ind, int target, int[] price,int[][] dp){
        //Step1
        if(ind<0)return 0;

        if(dp[ind][target]!=0)return dp[ind][target];

        //Step 2
        int notTake = cRod(ind-1, target, price,dp);
        int take = -99999;

        if(target>=ind+1){
            take = price[ind] + cRod(ind, target-(ind+1), price,dp);
        }

        //Step 3
        return dp[ind][target]=Math.max(take,notTake);
    }
}
