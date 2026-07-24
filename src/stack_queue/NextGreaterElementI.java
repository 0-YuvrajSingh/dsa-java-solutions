// Pattern: Monotonic Stack (Next Greater Element)
// LeetCode: 496 (Next Greater Element I)
// Difficulty: Easy

class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] result = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums2[stack.peek()] <= nums2[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : nums2[stack.peek()];
            stack.push(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums2[i], i);
        }

        int[] output = new int[m];
        for(int i = 0 ; i < m; i++) {
            int idx = map.get(nums1[i]);
            output[i] = result[idx];
        }
        return output;
    }
}