package dynamicProgramming;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(countWaysToMakeChange(new int[]{5,4,2,1},20));
    }
    public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here

        //Memoization
        long[][]	dp = new long[denominations.length][value+1];
        //Arrays.fill(dp,-1);
        return coinChange(denominations.length-1,value,denominations,dp);
    }

    private static long coinChange(int ind, int target, int[] denominations,long[][] dp){
        //Step 1
        if(ind==0){
            return(target%denominations[0]==0)?1:0;
        }

        //Memoization
        if(dp[ind][target]!=0)return dp[ind][target];

        //Step 2
        long notTake = coinChange(ind-1, target, denominations,dp);

        long take = 0;
        if(target>=denominations[ind]){
            take = coinChange(ind, target-denominations[ind], denominations,dp);
        }

        return dp[ind][target]=take+notTake;
    }
}
