class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        
        for(int j = 0; j <= m; j++)  dp[n][j] = word2.length()-j;
        for(int i = 0; i <= n; i++) dp[i][m] = word1.length()-i;
        for(int i = n-1; i >= 0; i--) {
            for(int j = m-1; j >= 0; j--) {
                if(word1.charAt(i) == word2.charAt(j)) dp[i][j] = dp[i+1][j+1];
                else {
                    int replace = 1 + dp[i+1][j+1];
                    int delete  = 1 + dp[i+1][j];
                    int insert  = 1 + dp[i][j+1];

                    dp[i][j] = Math.min(replace, Math.min(delete, insert));
                }
            }
        }
        return dp[0][0];
    }
}