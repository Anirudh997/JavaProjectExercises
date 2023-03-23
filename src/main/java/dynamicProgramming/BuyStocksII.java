package dynamicProgramming;

public class BuyStocksII {
    public static void main(String[] args) {
        System.out.println(bestTimeToBuyAndSellStockII(new int[]{7,1,5,4,3,6}));
    }

    public static int bestTimeToBuyAndSellStockII(int []prices) {
        // Write your code here.
        //Memoization
        int[][] dp = new int[prices.length][3];
        return buySell(0,1,prices.length,prices,dp);
    }

    private static int buySell(int ind, int buy, int len, int[] prices,int[][] dp){
        //Step 1
        if(ind==len)return 0;

        //Memoization
        if(dp[ind][buy]!=0)return dp[ind][buy];

        //Step 2
        int profit =0;
        if(buy==1){
            profit = Math.max((-prices[ind] + buySell(ind+1, 2, len, prices,dp)),(buySell(ind+1, 1, len, prices,dp)));
        }else{
            profit = Math.max((prices[ind]+buySell(ind+1, 1, len, prices,dp)),(buySell(ind+1, 2, len, prices,dp)));
        }

        //STep3
        return dp[ind][buy] =profit;

    }
}
