package dynamicProgramming;

public class SubsetSumToK {
    public static void main(String[] args) {
        System.out.println(subsetSumToK(4, 5, new int[]{4,3,2,1}));
    }

    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp = new int[n][k+1];
        return subSum(n-1,k,arr,dp);
    }

    private static boolean subSum(int ind, int target, int[] arr,int[][] dp){
        //Step 1
        if(target==0)return true;
        if(ind==0)return arr[0]==target;

        //Memoization
        if(dp[ind][target]!=0)return dp[ind][target]==1;

        //Step2
        boolean notTake = subSum(ind-1, target, arr,dp);
        boolean take=false;
        if(target>=arr[ind]){
            take=subSum(ind-1, target-arr[ind], arr,dp);
        }

        dp[ind][target]=take || notTake?1:-1;

        //Step 3
        return take || notTake;

    }

}
