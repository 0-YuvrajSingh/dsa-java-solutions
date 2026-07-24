// Pattern: Binary Search / Two Pointers (Merge)
// LeetCode: 4 (Median of Two Sorted Arrays)
// Difficulty: Hard

class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n+m];
        int x = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(nums1[i] <= nums2[j]) {
                merged[x] = nums1[i];
                i++;
            }
            else{
                merged[x] = nums2[j];
                j++;
            }
            x++;
        }
        while(i < n) {
            merged[x] = nums1[i];
            i++;
            x++;
        }
        while(j < m) {
            merged[x] = nums2[j];
            j++;
            x++;
        }

        if((n + m) % 2 == 0) return (double) (merged[(n+m)/2-1] + merged[(n+m)/2]) / 2;
        else return (double)merged[(n+m)/2];
    }
}