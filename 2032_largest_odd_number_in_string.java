class Solution {
    public String largestOddNumber(String s) {
        int n = s.length();
        int oddIndex = -1;
        for(int i = n - 1; i >= 0; i--) {
            if((s.charAt(i) & 1) == 1) {
                return s.substring(0, i+1);
            }
        }
        return "";
    }
}