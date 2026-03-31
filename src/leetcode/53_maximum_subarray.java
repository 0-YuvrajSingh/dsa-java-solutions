class Solution {
    public int maxSubArray(int[] nums) {
        long windowSum = nums[0];
        long max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // start from current element, or take from prey as well
            windowSum = Math.max(nums[i], windowSum + nums[i]); 
            max = Math.max(max, windowSum);
        }
        return (int)max;
    }
}