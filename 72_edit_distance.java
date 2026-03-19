class Solution {
    public int minDistance(String word1, String word2) {
        return solve(0, 0, word1, word2);
    }

    public int solve(int i, int j, String s, String p) {
        if(i == s.length() && j == p.length()) return 0;

        
        if(i == s.length() && j < p.length()) {
            return 1 + solve(i, j+1, s, p);
        }

    
        if(i < s.length() && j == p.length()) {
            return  1 + solve(i+1, j, s, p);
        }

       int replace = Integer.MAX_VALUE;
       int delete = Integer.MAX_VALUE;
       int insert = Integer.MAX_VALUE;
        if(s.charAt(i) != p.charAt(j)) {
           replace = 1 + solve(i+1, j+1, s, p);
           delete = 1 + solve(i+1, j, s, p);
           insert = 1 + solve(i, j+1, s, p);
        }

        if(s.charAt(i) == p.charAt(j)) return solve(i+1, j+1, s, p);

        return Math.min(replace, Math.min(insert, delete));
    }
}