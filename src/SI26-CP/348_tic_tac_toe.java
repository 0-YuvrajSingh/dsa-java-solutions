class TicTacToe {
    private final int[] rows;
    private final int[] cols;
    private int diag;
    private int antiDiag;
    private final int size;

    public TicTacToe(int n) {
        this.size = n;
        this.rows = new int[n];
        this.cols = new int[n];
    }

    public int move(int row, int col, int player) {
        int delta = player == 1 ? 1 : -1;

        rows[row] += delta;
        cols[col] += delta;

        if (row == col) {
            diag += delta;
        }

        if (row + col == size - 1) {
            antiDiag += delta;
        }

        if (Math.abs(rows[row]) == size || Math.abs(cols[col]) == size || Math.abs(diag) == size || Math.abs(antiDiag) == size) {
            return player;
        }

        return 0;
    }
}