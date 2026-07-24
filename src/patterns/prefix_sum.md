# Prefix Sum Pattern

## When to Use
- Range sum queries
- Subarray sum equals k
- Product of array except self

## Template - Prefix Sum Array
```java
int[] prefix = new int[n + 1];
for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + arr[i];
int rangeSum = prefix[r + 1] - prefix[l];
```

## Template - HashMap + Prefix Sum
```java
Map<Integer, Integer> map = new HashMap<>();
map.put(0, 1);
int prefixSum = 0, count = 0;
for (int num : nums) {
    prefixSum += num;
    if (map.containsKey(prefixSum - k)) count += map.get(prefixSum - k);
    map.merge(prefixSum, 1, Integer::sum);
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Subarray Sum Equals K | arrays/SubarraySumEqualsK | Medium |
| Product of Array Except Self | arrays/ProductOfArrayExceptSelf | Medium |
| Kadane Algorithm | arrays/KadaneAlgorithm | Medium |
| Modified Kadane | arrays/ModifiedKadaneAlgorithm | Medium |
| Equal Sum Grid Partition | arrays/EqualSumGridPartitionI | Medium |
| Prefix Sum (sliding window) | sliding_window/FixedSizeSlidingWindow | Easy |
