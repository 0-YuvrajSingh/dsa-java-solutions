# DP - LIS Pattern (Longest Increasing Subsequence)

## When to Use
- "Longest increasing/decreasing subsequence"
- "Russian doll envelopes"
- Patience sorting variant

## Template
```java
List<Integer> tails = new ArrayList<>();
for (int num : nums) {
    int pos = Collections.binarySearch(tails, num);
    if (pos < 0) pos = -(pos + 1);
    if (pos == tails.size()) tails.add(num);
    else tails.set(pos, num);
}
return tails.size();
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| (Add LIS problems here) | - | - |
