class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> set = new HashSet<>(wordDict);
        
        boolean[][] dp = new boolean[n+1][n+1];
        dp[n][n] = true;

        for(int i = n; i >= 1; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(set.contains(s.substring(j, i)) && dp[i][i]) {
                    dp[j][j] = true;
                }
            }
        }
        return dp[0][0];
    }
}