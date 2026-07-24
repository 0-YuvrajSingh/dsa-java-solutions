// Pattern: Greedy / Bit Manipulation
// LeetCode: 2032 (Largest Odd Number in String)
// Difficulty: Easy

class LargestOddNumberInString {
    public String largestOddNumber(String s) {
        int n = s.length();
        for(int i = n - 1; i >= 0; i--) {
            if((s.charAt(i) & 1) == 1) {
                return s.substring(0, i+1);
            }
        }
        return "";
    }
}