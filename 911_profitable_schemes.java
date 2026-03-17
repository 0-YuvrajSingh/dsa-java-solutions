class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int a = group.length;
        int[][][] dp = new int[a + 1][n + 1][minProfit + 1];

        // Base Case :
        for(int j = 0; j <= n; j++) {
            dp[a][j][minProfit] = 1;
        }

        for(int i = a - 1; i >=0 ; i--) { // index
            for(int j = 0; j <= n; j++) { // group size
                for(int k = 0; k <= minProfit; k++) { // Min Profit
                    int skip = dp[i+1][j][k];
                    int take = 0;
                    if(j + group[i] <= n) {
                        int capped = Math.min(k + profit[i], minProfit);
                        take = dp[i+1][j+group[i]][capped];
                    }
                    dp[i][j][k] = (take + skip) % 1000000007;
                }
            }
        }                     
        return dp[0][0][0];
    }

    public int solve(int idx, int sum, int groupSize, int minProfit, int[] group, int[] profit, int n, int[][][] dp) {
        if (groupSize > n) return 0;
        if (idx >= group.length) return sum >= minProfit ? 1 : 0;

        if (dp[idx][groupSize][sum] != -1) return dp[idx][groupSize][sum];

        int cappedSum = Math.min(sum + profit[idx], minProfit);
        int take = solve(idx + 1, cappedSum, groupSize + group[idx], minProfit, group, profit, n, dp);
        int skip = solve(idx + 1, sum, groupSize, minProfit, group, profit, n, dp);

        return dp[idx][groupSize][sum] = (take + skip) % 1000000007;
    }
}