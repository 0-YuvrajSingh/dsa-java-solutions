class Solution {
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

    /* public int beauty(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        if(list.size() == 1) return 0;

        list.sort((a,b) -> Integer.compare(map.get(a), map.get(b)));

        int ans = map.get(list.get(list.size()-1)) - map.get(list.get(0));
        return ans;
    }
    */
}