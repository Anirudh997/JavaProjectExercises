package dynamicProgramming;

public class MinimumPathSum {
    public static void main(String[] args) {
        System.out.println(minSumPath(new int[][]{{5 ,9, 6}
                ,{11 ,5, 2}}));
    }
    public static int minSumPath(int[][] grid) {
        // Write your code here.

        //Using Dynamic Programming Memoization
        int[][] dp = new int[grid.length][grid[0].length];

        //Recursion
        //DP Memoization Step1 adding dp params
        return minPath(grid.length-1,grid[0].length-1,grid,dp);

/*        //DP - Tabulation
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0)dp[i][j]=grid[i][j];
                else{
                    int right=0;
                    int down=0;
                    if(i>0)right = grid[i][j] + dp[i-1][j];
                    if(j>0)down = grid[i][j] + dp[i][j-1];
                    dp[i][j]=Math.min(right,down);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];

 */
    }


    private static int minPath(int i, int j, int[][] grid, int[][] dp){
        //Step1 Express in terms of i,j
        //basecase
        if(i==0&&j==0)return grid[0][0];
        if(i<0 || j<0)return 9999999;

        //DP memoization step 3 using it stop overlapping sub problems
        if(dp[i][j]!=0)return dp[i][j];

        //Step2 checking all possible solutions
        int left = grid[i][j]+ minPath(i-1, j, grid,dp);
        int up = grid[i][j] + minPath(i, j-1, grid,dp);

        //Step3 Doing the required operation.. Sum, Max, Min
        //DP memoization step2 inserting result into dp array
        return dp[i][j]=Math.min(left,up);
    }

}
