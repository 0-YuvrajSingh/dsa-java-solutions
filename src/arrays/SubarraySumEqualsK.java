// Pattern: Prefix Sum + Hash Map
// LeetCode: 560 (Subarray Sum Equals K)
// Difficulty: Medium
// Note: Brute force O(n^2). For optimal O(n) use HashMap.

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
}