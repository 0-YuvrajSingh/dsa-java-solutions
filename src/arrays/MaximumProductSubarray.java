// Pattern: Kadane's Algorithm (Maximum Product Subarray)
// LeetCode: 152 (Maximum Product Subarray)
// Difficulty: Medium

class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int val = nums[i];

            if(val < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(val, val*max);
            min = Math.min(val, val*min);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}