// Pattern: Hashing / Frequency Count
// LeetCode: 242 (Valid Anagram)
// Difficulty: Easy

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }

        for (int x : arr) {
            if (x != 0) return false;
        }

        return true;
    }
}