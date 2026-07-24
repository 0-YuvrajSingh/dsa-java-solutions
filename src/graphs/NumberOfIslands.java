// Pattern: BFS (Number of Islands - Grid Traversal)
// Difficulty: Medium

class NumberOfIslands {
    private static final int[] ROW = {-1, 1, 0, 0};
    private static final int[] COL = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int r, int c, boolean[][] visited) {
        int n = grid.length, m = grid[0].length;
        java.util.Queue<int[]> queue = new java.util.LinkedList<>();
        queue.offer(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int d = 0; d < 4; d++) {
                int nr = cell[0] + ROW[d];
                int nc = cell[1] + COL[d];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == '1' && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}