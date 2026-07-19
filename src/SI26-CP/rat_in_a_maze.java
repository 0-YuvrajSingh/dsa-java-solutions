import java.util.*;

class RatInAMazeSolver {
    private static final int[] ROW_DELTAS = {-1, 1, 0, 0};
    private static final int[] COL_DELTAS = {0, 0, -1, 1};
    private static final char[] MOVES = {'U', 'D', 'L', 'R'};

    private static class Node {
        int row, col;
        String path;

        Node(int row, int col, String path) {
            this.row = row;
            this.col = col;
            this.path = path;
        }
    }

    public String findShortestPath(int[][] maze) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return "";
        }

        int rows = maze.length;
        int cols = maze[0].length;

        if (maze[0][0] == 0 || maze[rows - 1][cols - 1] == 0) {
            return "";
        }

        boolean[][] visited = new boolean[rows][cols];
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(new Node(0, 0, ""));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            if (cur.row == rows - 1 && cur.col == cols - 1) {
                return cur.path;
            }

            for (int d = 0; d < 4; d++) {
                int nr = cur.row + ROW_DELTAS[d];
                int nc = cur.col + COL_DELTAS[d];

                if (isValid(nr, nc, maze, visited)) {
                    visited[nr][nc] = true;
                    queue.offer(new Node(nr, nc, cur.path + MOVES[d]));
                }
            }
        }

        return "";
    }

    private boolean isValid(int row, int col, int[][] maze, boolean[][] visited) {
        return row >= 0 && row < maze.length &&
               col >= 0 && col < maze[0].length &&
               maze[row][col] == 1 &&
               !visited[row][col];
    }
}