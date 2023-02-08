package dynamicProgramming;

public class LowestCommonSubsequence {
    public static void main(String[] args) {
        //String result="";
        System.out.println(lcs("abcdef","defab"));
        //System.out.println(result);

    }
    public static int lcs(String s, String t) {
        //Your code goes here
        //Memoization
        int[][] dp = new int[s.length()][t.length()];

        return slcs(s.length()-1,t.length()-1,s,t,dp);
    }

    private static int slcs(int m, int n, String s, String t,int[][] dp){
        //Step 1
        if(m<0 || n<0)return 0;

        if(dp[m][n]!=0)return dp[m][n];

        //Step 2
        //Possibility 1 - if the character are same from last
        if(s.charAt(m)==t.charAt(n)){
            return dp[m][n]=1 + slcs(m-1, n-1, s, t,dp);
        }

        //Possibility 2 - if the character are not same
        return dp[m][n]=Math.max(slcs(m-1,n, s, t,dp),slcs(m,n-1, s, t,dp));

    }
}
