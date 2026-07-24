// Pattern: Binary Search on Answer
// LeetCode: 410 (Split Array Largest Sum)
// Difficulty: Hard

class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int low = 1;
        int high = 0;
        for(int num : nums) high += num;

        int ans = high;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(func(mid, nums) <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int func(int limit, int[] nums) {
        int div = 1;
        int capa = limit;
        for(int num : nums) {
            if(num > limit) return Integer.MAX_VALUE;
            if(num <= capa)  capa -= num;
            else {
                div++;
                capa = limit - num;
            }
        }
        return div;
    }
}