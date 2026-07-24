// Pattern: Kadane's Algorithm (Maximum Subarray)
// LeetCode: 53 (Maximum Subarray)
// Difficulty: Medium

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        long windowSum = nums[0];
        long max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            windowSum = Math.max(nums[i], windowSum + nums[i]);
            max = Math.max(max, windowSum);
        }
        return (int)max;
    }
}