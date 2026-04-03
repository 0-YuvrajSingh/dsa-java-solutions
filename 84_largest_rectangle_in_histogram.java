class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] nse = new int[n];
        findNSE(nse, heights, stack);

        stack.clear();

        int[] pse = new int[n];
        findPSE(pse, heights, stack);

        int area = 0;
        for(int i = 0; i < n; i++) {
            area = Math.max(area, heights[i]*(nse[i]-pse[i]-1));
        }

        return area;
    }

    public void findNSE(int[] nse, int[] arr, ArrayDeque<Integer> stack) {
        int n = arr.length;
        for(int i =  n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) { // equal values so its depends on rightmost
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
    }

    public void findPSE(int[] pse, int[] arr, ArrayDeque<Integer> stack) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }
}