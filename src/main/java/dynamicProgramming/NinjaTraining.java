package dynamicProgramming;

import java.util.Arrays;

/*
Ninja is planing this ‘N’ days-long training schedule. Each day, he can perform any one of these three activities. (Running, Fighting Practice or Learning New Moves). Each activity has some merit points on each day. As Ninja has to improve all his skills, he can’t do the same activity in two consecutive days. Can you help Ninja find out the maximum merit points Ninja can earn?
You are given a 2D array of size N*3 ‘POINTS’ with the points corresponding to each day and activity. Your task is to calculate the maximum number of merit points that Ninja can earn.
For Example
If the given ‘POINTS’ array is [[1,2,5], [3 ,1 ,1] ,[3,3,3] ],the answer will be 11 as 5 + 3 + 3.
 */

public class NinjaTraining {
    public static void main(String[] args) {
        int arr[][]={{1, 2, 5},
        {3 ,1 ,1},
        {3, 3 ,3}};
        System.out.println(ninjaTraining(3,arr));
    }

    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int[][] dp =new int[n+1][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        //Recursion and memoization
        //int result= maxTraining(n-1, 3, points,dp);


        //Tabulation method
        int[][] dp2 = new int[n][4];

        dp2[0][0] = Math.max(points[0][1],points[0][2]);
        dp2[0][1] = Math.max(points[0][0],points[0][2]);
        dp2[0][2] = Math.max(points[0][0],points[0][1]);
        dp2[0][3] = Math.max(points[0][1],Math.max(points[0][1],points[0][2]));

        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp2[day][last]=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point = points[day][task] + dp2[day-1][task];
                        dp2[day][last]= Math.max(dp2[day][last],point);
                    }
                }
            }
        }

        return dp2[n-1][3];
    }

    private static int maxTraining(int day, int last,int points[][], int[][] dp){
        if(day==0){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    maxi = Math.max(maxi,points[0][i]);
                }
            }
            return maxi;
        }

        if(dp[day][last]!=-1){
            return dp[day][last];
        }

        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last){
                int point = points[day][task] + maxTraining(day-1,task,points,dp);
                maxi=Math.max(point,maxi);
            }
        }
        return dp[day][last]=maxi;
    }
}
