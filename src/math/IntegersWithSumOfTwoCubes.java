// Pattern: Math / Enumeration
// LeetCode: 4268 (Integers with Multiple Sum of Two Cubes)
// Difficulty: Medium

class IntegersWithSumOfTwoCubes {
    public List<Integer> findGoodIntegers(int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int a = 1; a * a * a <= n; a++) {
            int x = a * a * a;

            for (int b = a; x + b * b * b <= n; b++) {
                int y = b * b * b;
                int sum = x + y;

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        List<Integer> res = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) >= 2) res.add(key);
        }

        Collections.sort(res);
        return res;
    }
}