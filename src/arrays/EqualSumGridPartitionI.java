// Pattern: Prefix Sum (Grid Partition)
// LeetCode: 3849 (Equal Sum Grid Partition I)
// Difficulty: Medium

class EqualSumGridPartitionI {
    public boolean canPartitionGrid(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        long total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                total += grid[i][j];
            }
        }

        long curr = 0;

        // horizontal cut
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                curr += grid[i][j];
            }

            if (curr * 2 == total) return true;
        }

        curr = 0;

        // vertical cut
        for (int j = 0; j < m - 1; j++) {
            for (int i = 0; i < n; i++) {
                curr += grid[i][j];
            }

            if (curr * 2 == total) return true;
        }

        return false;
    }
}