class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int a = group.length;
        int[][][] dp = new int[a + 1][n + 1][minProfit + 1];
        for (int[][] d2 : dp)
            for (int[] d1 : d2)
                Arrays.fill(d1, -1);                        
        return solve(0, 0, 0, minProfit, group, profit, n, dp) % 1000000007;
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