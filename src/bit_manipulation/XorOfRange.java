// Pattern: Bit Manipulation (XOR Range)
// Difficulty: Easy-Medium

class XorOfRange {
    public int xorUpto(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    public int xorRange(int l, int r) {
        return xorUpto(r) ^ xorUpto(l - 1);
    }
}