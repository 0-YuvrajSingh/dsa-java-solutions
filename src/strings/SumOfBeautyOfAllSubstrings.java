// Pattern: Hashing (Frequency Count)
// LeetCode: 1890 (Sum of Beauty of All Substrings)
// Difficulty: Medium

class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n ; i++) {
            int[] freq = new int[26];
            for(int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                
                int min = Integer.MAX_VALUE;
                int max = 0;

                for(int f : freq) {
                    if(f > 0) {
                        min = Math.min(min, f);
                        max = Math.max(max, f);
                    }
                }

                ans += max - min;
            }
        }
        return ans;
    }
}