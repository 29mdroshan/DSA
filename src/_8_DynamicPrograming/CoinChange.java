package _8_DynamicPrograming;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount +1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for(int i  = 0; i <dp.length; i++) {
            for(int c : coins) {
                if(i - c >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i-c]);
                }
            }
        }

        return dp[amount] != amount+1 ? dp[amount]: -1;

    }

    public static void main(String args[]) {
        CoinChange cc = new CoinChange();
//        cc.coinChange(arr, 11);
        int nums[] = {3,2,1,5,6,4};
        int k =2;

    }
}
