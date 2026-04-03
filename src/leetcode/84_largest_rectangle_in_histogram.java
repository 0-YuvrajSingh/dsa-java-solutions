class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        for(int i = n - 1; i >= 0; i--) {
            int width = 1;
            while(!stack.isEmpty() && heights[stack.peek()[0]] >= heights[i]) {
                width += stack.pop()[1];
            }
            stack.push(new int[]{i, width});
            area = Math.max(area, heights[stack.peek()[0]]*width);
            
        }
        return area;
    }
}