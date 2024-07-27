package dynamicProgramming;
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    public static void main(String[] args) {
        //System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        return robTest(nums,0,dp);
    }

    private static int robTest(int[] nums, int ind,int[] dp){
        //Step1
        //Base case
        if(ind>=nums.length){
            return 0;
        }

        if(dp[ind]!=0)return dp[ind];

        //Step 2 Ways
        //Even steps
        int even = nums[ind] + robTest(nums,ind+2,dp);

        //Odd Steps
        int odd=0;
        if(ind <nums.length-1){
            odd = nums[ind+1] + robTest(nums,ind+3,dp);
        }


        //Step3
        //Returning the max amount
        return dp[ind]=Math.max(odd, even);
    }
}
