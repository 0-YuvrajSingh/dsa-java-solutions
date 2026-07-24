// Pattern: DP (Maximal Square / Matrix DP)
// LeetCode: 221 (Maximal Square)
// Difficulty: Medium

class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[m];
        int area = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int val = matrix[i][j] - '0';
                if(val == 0) arr[j] = 0;
                else arr[j] += val;
            }
            area = Math.max(area, MAH(arr));
        }
        return area;
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
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int sqWidth = width >= arr[i] ? arr[i] : 0;
            ans = Math.max(ans, arr[i] * sqWidth);
        }

        return ans;
    }
}