// Pattern: Backtracking (Constraint-based)
// LeetCode: 37 (Sudoku Solver)
// Difficulty: Hard

class SudokuSolver {
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];
        List<int[]> emptyCells = new ArrayList<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                if (value == '.') {
                    emptyCells.add(new int[]{row, col});
                    continue;
                }

                int digit = value - '0';
                int boxIndex = (row / 3) * 3 + (col / 3);
                rows[row][digit] = true;
                cols[col][digit] = true;
                boxes[boxIndex][digit] = true;
            }
        }

        solve(board, emptyCells, 0, rows, cols, boxes);
    }

    private boolean solve(char[][] board, List<int[]> emptyCells, int index, boolean[][] rows,
                          boolean[][] cols, boolean[][] boxes) {
        if (index == emptyCells.size()) {
            return true;
        }

        int row = emptyCells.get(index)[0];
        int col = emptyCells.get(index)[1];
        int boxIndex = (row / 3) * 3 + (col / 3);

        for (int digit = 1; digit <= 9; digit++) {
            if (rows[row][digit] || cols[col][digit] || boxes[boxIndex][digit]) {
                continue;
            }

            board[row][col] = (char) ('0' + digit);
            rows[row][digit] = true;
            cols[col][digit] = true;
            boxes[boxIndex][digit] = true;

            if (solve(board, emptyCells, index + 1, rows, cols, boxes)) {
                return true;
            }

            board[row][col] = '.';
            rows[row][digit] = false;
            cols[col][digit] = false;
            boxes[boxIndex][digit] = false;
        }

        return false;
    }
}