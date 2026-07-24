// Pattern: Cyclic Sort / Sorting
// LeetCode: 268 (Missing Number)
// Difficulty: Easy

class MissingNumberLC {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i) return i;
        }
        return nums.length;
    }
}