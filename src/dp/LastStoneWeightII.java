// Pattern: DP (Partition / Subset Sum / Knapsack)
// LeetCode: 1130 (Last Stone Weight II)
// Difficulty: Medium

class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {

        int n = stones.length;
        int total = 0;

        for (int x : stones) total += x;

        int target = total / 2;

        int[][] dp = new int[n + 1][target + 1];

        for (int sum = 0; sum <= target; sum++) {
            dp[n][sum] = Math.abs(total - 2 * sum);
        }

        for (int idx = n - 1; idx >= 0; idx--) {

            for (int sum = 0; sum <= target; sum++) {

                int skip = dp[idx + 1][sum];

                int take = Integer.MAX_VALUE;

                if (sum + stones[idx] <= target) {
                    take = dp[idx + 1][sum + stones[idx]];
                }

                dp[idx][sum] = Math.min(take, skip);
            }
        }

        return dp[0][0];
    }
}