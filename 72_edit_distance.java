class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] d1 : dp) Arrays.fill(d1, -1);
        //till index i of word1 and j of word2 how many of the operations have been performed 
        return solve(0, 0, word1, word2, dp);
    }

    public int solve(int i, int j, String s, String p, int[][] dp) {
        if(i == s.length() && j == p.length()) return 0;

        
        if(i == s.length() && j < p.length()) {
            return 1 + solve(i, j+1, s, p, dp);
        }

    
        if(i < s.length() && j == p.length()) {
            return  1 + solve(i+1, j, s, p, dp);
        }

        if(dp[i][j] != -1) return dp[i][j];

       int replace = Integer.MAX_VALUE;
       int delete = Integer.MAX_VALUE;
       int insert = Integer.MAX_VALUE;
        if(s.charAt(i) != p.charAt(j)) {
           replace = 1 + solve(i+1, j+1, s, p, dp);
           delete = 1 + solve(i+1, j, s, p, dp);
           insert = 1 + solve(i, j+1, s, p, dp);
        }

        if(s.charAt(i) == p.charAt(j)) return solve(i+1, j+1, s, p, dp);

        return dp[i][j] = Math.min(replace, Math.min(insert, delete));
    }
}