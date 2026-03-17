class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int[] d1 : dp) {
            Arrays.fill(d1, -1);
        }
        int ans = solve(0,  amount, coins, dp);
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }

    public int solve(int idx, int amount, int[] coins, int[][] dp) {
        if(amount < 0) return Integer.MAX_VALUE;
        if(idx >= coins.length) {
            if(amount == 0) return 0;
            return Integer.MAX_VALUE;
        }

        if(dp[idx][amount] != -1) return dp[idx][amount];
     
        int takeVal = solve(idx, amount-coins[idx], coins, dp);
        int take = takeVal == Integer.MAX_VALUE ? Integer.MAX_VALUE : 1 + takeVal;
        int skip = solve(idx+1, amount, coins, dp);

        return dp[idx][amount] = Math.min(take, skip);
    }
}