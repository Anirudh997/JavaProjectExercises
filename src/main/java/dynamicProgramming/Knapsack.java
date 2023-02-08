package dynamicProgramming;
/*
Code Studio Knapsack problem
we have to find max value theif can stole for the target weight.
 */
public class Knapsack {
    public static void main(String[] args) {
        int[] weight={1, 2 ,4 ,5};
        int[] value={5, 4, 8 ,6};
        int n=4;
        int maxWeight=5;
        System.out.println(knapsack(weight, value,  n,  maxWeight));

    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        //Memoization
        int[][] dp = new int[n][maxWeight+1];

        return maxKnap(n-1,maxWeight,value,weight,dp);

    }

    private static int maxKnap(int ind, int target, int[] value,int[] weight,int[][] dp){

        //Step 1
        if(ind==0){
            if(target>=weight[0])return value[0];
            else{
                return 0;
            }
        }

        if(dp[ind][target]!=0)return dp[ind][target];

        //Step 2
        int notTake = 0 + maxKnap(ind-1,target,value,weight,dp);
        int take = -999999;

        if(weight[ind]<=target){
            take= value[ind] + maxKnap(ind-1,target-weight[ind],value,weight,dp);
        }

        //Step 3
        return dp[ind][target]=Math.max(notTake,take);
    }
}
