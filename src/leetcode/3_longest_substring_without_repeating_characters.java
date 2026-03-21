class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            while (freq.containsKey(ch)) {
                freq.remove(s.charAt(left));
                left++;
            }

            freq.put(ch, 1);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}