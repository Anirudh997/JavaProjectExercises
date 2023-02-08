package dynamicProgramming;

public class TotalUniquePaths {
    public static void main(String[] args) {
        /*
Problem Statement
You are present at point ‘A’ which is the top-left cell of an M X N matrix, your destination is point ‘B’, which is the bottom-right cell of the same matrix.
Your task is to find the total number of unique paths from point ‘A’ to point ‘B’.
In other words, you will be given the dimensions of the matrix as integers ‘M’ and ‘N’, your task is to find the total number of unique paths from the cell MATRIX[0][0] to MATRIX['M' - 1]['N' - 1].
To traverse in the matrix, you can either move Right or Down at each step. For example in a given point MATRIX[i] [j], you can move to either MATRIX[i + 1][j] or MATRIX[i][j + 1].
         */
        System.out.println(uniquePaths(3,2));
    }

    public static int uniquePaths(int m, int n) {
        // Write your code here.

        //Adding memoization
        int[][] dp = new int[m][n];
        //Arrays.fill(dp,-1);

        //Tabulation.. used same dp array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0)dp[i][j]=1;
                else{
                    int down=0;
                    int right=0;
                    if(i>0)right=dp[i-1][j];
                    if(j>0)down=dp[i][j-1];
                    dp[i][j]=right+down;
                }
            }
        }
        return dp[m-1][n-1];


        //Recursion - with memoization add dp in param
//        return uniPaths(m-1,n-1,dp);
    }

    //Step 1 DP(Memoization) Adding created dp param
    private static int uniPaths(int i, int j, int[][] dp){
        //Recursion Step 1
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }

        //Step3 DP(Memoization) implementing the condition
        if(dp[i][j]!=0)return dp[i][j];

        //Recursion Step 2
        int left = uniPaths(i-1,j,dp);
        int up = uniPaths(i,j-1,dp);

        //Recursion Step 3
        //Step 2 DP(memoization) assigning result to dp
        return dp[i][j]=left + up;
    }
}
