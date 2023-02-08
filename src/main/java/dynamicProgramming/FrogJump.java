package dynamicProgramming;

import java.util.Arrays;

public class FrogJump {

    public static void main(String[] args) {
        System.out.println(frogJump(5, new int[]{10, 20, 30, 10, 20}));
    }

    public static int frogJump(int n, int heights[]) {

        // Write your code here..
//        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
        //return minjump(heights,n-1,dp);

        //Tabulation
        int[] dp2=new int[n];
        Arrays.fill(dp2,-1);
        dp2[0]=0;
        for(int i=1;i<n;i++){
            int fs=dp2[i-1]+Math.abs(heights[i-1]-heights[i]);
            int ss=9999999;
            if(i>1){
                ss=dp2[i-2]+Math.abs(heights[i-2]-heights[i]);
            }
            dp2[i]=Math.min(fs,ss);
        }

        return dp2[n-1];

    }

    /*private static int minjump(int[] heights, int ind,int[] dp){
        if(ind==0){
            return 0;
        }

        if(dp[ind]!=-1)return dp[ind];

        int right=99999999;
        int left=minjump(heights, ind-1,dp)+ Math.abs(heights[ind]-heights[ind-1]);
        if(ind>1){
            right=minjump(heights, ind-2,dp)+ Math.abs(heights[ind]-heights[ind-2]);
        }

        return dp[ind]=Math.min(left,right);
    }
    */
    
}
