// Pattern: Stack (Reverse Words)
// LeetCode: 151 (Reverse Words in a String)
// Difficulty: Medium

class ReverseWordsInString {
    public String reverseWords(String s) {
        String str = s.trim();
        Deque<String> st = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                if (sb.length() > 0) {
                    st.push(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }

        if (sb.length() > 0) st.push(sb.toString());

        sb.setLength(0);
        while (!st.isEmpty()) {
            sb.append(st.pop());
            if (!st.isEmpty()) sb.append(' ');
        }

        return sb.toString();
    }
}