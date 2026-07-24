// Pattern: Bit Manipulation (Brian Kernighan's Algorithm)
// Difficulty: Easy

class CountSetBits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}