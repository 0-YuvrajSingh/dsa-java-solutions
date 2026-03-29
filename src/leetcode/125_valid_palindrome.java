class Solution {
    public boolean isPalindrome(String s) {
        int left  = 0;
        int right = s.length() - 1;
        while(left < right) {
            char lhs = s.charAt(left);
            char rhs = s.charAt(right);

            if(('A' <= lhs && lhs <= 'Z')) {
                lhs =(char) (lhs + 32);
                if('A' <= rhs && rhs <= 'Z') {
                    rhs = (char) (rhs + 32);
                    if(lhs != rhs) return false;
                    left++;
                    right--;
                } else if(('a' <= rhs && rhs <= 'z') || ('0' <= rhs && rhs <= '9')) {
                    if(lhs != rhs) return false;
                    left++;
                    right--;
                } else {
                    right--;
                }
                
            } else if(('a' <= lhs && lhs <= 'z') || ('0' <= lhs && lhs <= '9')) {
                if('A' <= rhs && rhs <= 'Z') {
                    rhs = (char) (rhs + 32);
                    if(lhs != rhs) return false;
                    left++;
                    right--;
                } else if(('a' <= rhs && rhs <= 'z') || ('0' <= rhs && rhs <= '9')) {
                    if(lhs != rhs) return false;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return true;
    }
}