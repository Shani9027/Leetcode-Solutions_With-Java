class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int INF = (int) 1e9;

        int[][] dp = new int[n + 1][amount + 1];

        for (int j = 1; j <= amount; j++) {
            dp[0][j] = INF;
        }
        dp[0][0] = 0;

        for (int j = 0; j <= amount; j++) {
            if (j % coins[0] == 0) {
                dp[1][j] = j / coins[0];
            } else {
                dp[1][j] = INF;
            }
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                int take = INF;
                if (j >= coins[i - 1]) {
                    take = 1 + dp[i][j - coins[i - 1]];
                }
                dp[i][j] = Math.min(take, dp[i - 1][j]);
            }
        }

        return dp[n][amount] >= INF ? -1 : dp[n][amount];
    }
}
