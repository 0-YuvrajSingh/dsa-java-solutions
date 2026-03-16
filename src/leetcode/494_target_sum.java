import java.util.Arrays;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int[][] dp = new int[n+1][2*sum+1];

        for(int i = 0; i <= n; i++)
            Arrays.fill(dp[i], -1);

        return solve(0, target, dp, nums, sum);
    }

    public int solve(int idx, int target, int[][] dp, int[] nums, int sum) {

        if(target > sum || target < -sum) return 0;

        if(idx == nums.length) {
            return target == 0 ? 1 : 0;
        }

        if(dp[idx][target + sum] != -1)
            return dp[idx][target + sum];

        int pos = solve(idx+1, target - nums[idx], dp, nums, sum);
        int neg = solve(idx+1, target + nums[idx], dp, nums, sum);

        return dp[idx][target + sum] = pos + neg;
    }
}
