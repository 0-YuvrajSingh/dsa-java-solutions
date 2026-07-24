// Pattern: Bit Manipulation (Power of Two Check)
// Difficulty: Easy

class CheckPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}