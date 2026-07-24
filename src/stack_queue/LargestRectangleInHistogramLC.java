// Pattern: Monotonic Stack (Largest Rectangle in Histogram)
// LeetCode: 84 (Largest Rectangle in Histogram)
// Difficulty: Hard

class LargestRectangleInHistogramLC {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        Deque<Integer> stack = new ArrayDeque<>();

        int[] pse = new int[n];
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        int[] nse = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        
        long area = 0;
        for(int i = 0; i < n; i++) {
            long curr = heights[i] * (nse[i] - pse[i] - 1);
            area = Math.max(area, curr);
        }

        return (int) area;
    }
}