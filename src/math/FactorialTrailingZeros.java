// Pattern: Math (Factorial Trailing Zeros)
// Difficulty: Medium

class FactorialTrailingZeros {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}