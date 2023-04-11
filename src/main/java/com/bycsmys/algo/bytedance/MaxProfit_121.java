package com.bycsmys.algo.bytedance;

/**
 * 买卖股票最佳时机
 */
public class MaxProfit_121 {

    public int maxProfit(int[] prices){


        if(prices == null || prices.length == 0){
            return 0;
        }

        int[][] dp = new int[prices.length][2];

        // 持有
        dp[0][0] = - prices[0];
        // 未持有
        dp[0][1] = 0;

        for(int i = 1 ; i < prices.length ; i ++){
            // 第i天持有 = Max（ 前一天持有，今天买的最大值）
            dp[i][0] = Math.max(dp[i-1][0],-prices[i]);

            // 第i天不持有 = Max (前一天持有 + 今天卖，前一天不持有）
            dp[i][1] = Math.max(dp[i-1][0] + prices[i],dp[i-1][1]);
        }

        return dp[prices.length -1][1];
    }
}
