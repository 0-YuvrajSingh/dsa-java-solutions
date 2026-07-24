// Pattern: Backtracking
// LeetCode: 51 (N-Queens)
// Difficulty: Hard

class NQueensSolver {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = '.';
            }
        }

        boolean[] columns = new boolean[n];
        boolean[] mainDiagonals = new boolean[2 * n - 1];
        boolean[] antiDiagonals = new boolean[2 * n - 1];

        backtrack(0, board, columns, mainDiagonals, antiDiagonals, result);
        return result;
    }

    private void backtrack(int row, char[][] board, boolean[] columns, boolean[] mainDiagonals,
                           boolean[] antiDiagonals, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            result.add(buildBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            int mainDiagonalIndex = row - col + n - 1;
            int antiDiagonalIndex = row + col;

            if (columns[col] || mainDiagonals[mainDiagonalIndex] || antiDiagonals[antiDiagonalIndex]) {
                continue;
            }

            board[row][col] = 'Q';
            columns[col] = true;
            mainDiagonals[mainDiagonalIndex] = true;
            antiDiagonals[antiDiagonalIndex] = true;

            backtrack(row + 1, board, columns, mainDiagonals, antiDiagonals, result);

            board[row][col] = '.';
            columns[col] = false;
            mainDiagonals[mainDiagonalIndex] = false;
            antiDiagonals[antiDiagonalIndex] = false;
        }
    }

    private List<String> buildBoard(char[][] board) {
        List<String> layout = new ArrayList<>();
        for (char[] row : board) {
            layout.add(new String(row));
        }
        return layout;
    }
}