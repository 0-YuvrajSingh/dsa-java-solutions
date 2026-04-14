class Solution {
    public int romanToInt(String s) {
        int[] val = new int[26];
        val['I' - 'A'] = 1;
        val['V' - 'A'] = 5;
        val['X' - 'A'] = 10;
        val['L' - 'A'] = 50;
        val['C' - 'A'] = 100;
        val['D' - 'A'] = 500;
        val['M' - 'A'] = 1000;

        int n = s.length();
        int ans = val[s.charAt(n - 1) - 'A'];

        for (int i = n - 1; i > 0; i--) {
            int curr = val[s.charAt(i) - 'A'];
            int prev = val[s.charAt(i - 1) - 'A'];

            if (curr <= prev) ans += prev;
            else ans -= prev;
        }
        return ans;
    }
}