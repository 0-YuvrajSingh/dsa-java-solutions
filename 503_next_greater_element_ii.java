class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n  = nums.length;

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];
        for(int i = 2*n - 1; i >= 0; i--) {
            int idx = i % n;
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[idx]) {
                stack.pop();
            }
            if(i < n) {
                result[idx] = stack.isEmpty() ? -1 : nums[stack.peek()];
            }
            stack.push(idx);
        }
        return result;
    }
}