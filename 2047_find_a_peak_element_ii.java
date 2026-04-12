class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            int row = maxElement(mid, n, m, mat);

            int left = mid > 0 ? mat[row][mid - 1] : -1;
            int right = mid < m - 1 ? mat[row][mid + 1] : -1;

            if((mat[row][mid] > left) &&(mat[row][mid] > right)) {
                return new int[]{row, mid};
            } else if(mat[row][mid] < left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{-1, -1};
    }

    public int maxElement(int mid, int n, int m, int[][] mat) {
        int maxIndex = -1;
        int maxElement = -1;
        for(int i = 0; i < n; i++) {
            if(mat[i][mid] > maxElement) {
                maxElement = mat[i][mid];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}