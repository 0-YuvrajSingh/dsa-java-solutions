// Pattern: Stack (Parentheses Matching)
// LeetCode: 20 (Valid Parentheses)
// Difficulty: Easy

class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
            i++;
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}