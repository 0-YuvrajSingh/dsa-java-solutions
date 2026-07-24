// Pattern: Two Pointers / Expand Around Center
// LeetCode: 5 (Longest Palindromic Substring)
// Difficulty: Medium

class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();

        String res = "";
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+1);

            int len = Math.max(len1, len2);
            if(len > maxLen) {
                maxLen = len;
                start = i - (len - 1)/2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    public int expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}