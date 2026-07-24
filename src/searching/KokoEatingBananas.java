// Pattern: Binary Search on Answer
// LeetCode: 907 (Koko Eating Bananas)
// Difficulty: Medium

class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++) high = Math.max(high, piles[i]);
        int ans = high;
        while(low <= high) {
            int mid = low + (high - low)/2;
            long taken = hours(piles, mid);
            if(taken <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public long hours(int[] arr, int limit) {
        long hour = 0;
        for(int val : arr) {
            hour += (val + limit - 1) / limit;
        }
        return hour;
    }
}