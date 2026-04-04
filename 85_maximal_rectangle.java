class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int ans = 0;
        int[] arr = new int[m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int val =(int) matrix[i][j] - '0';
                if(val == 0) arr[j] = 0;
                arr[j] += val;
            }
            ans = Math.max(ans, MAH(arr));
        }

        return ans;
    }

    public int MAH(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();

        int[] pse = new int[n];
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        int[] nse = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int area = 0;
        for(int i = 0; i < n; i++) {
            area =  Math.max(area, arr[i]*(nse[i]-pse[i]-1));
        }

        return area;
    }
}