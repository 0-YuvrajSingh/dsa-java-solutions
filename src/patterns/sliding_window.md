# Sliding Window Pattern

## When to Use
- Contiguous subarray/substring problems
- "Find max/min/length of subarray of size k"
- "Find longest substring with at most k distinct chars"

## Template - Fixed Size
```java
int windowSize = k;
int windowSum = 0;
for (int i = 0; i < n; i++) {
    windowSum += arr[i];
    if (i >= windowSize) windowSum -= arr[i - windowSize];
    if (i >= windowSize - 1) // update result
}
```

## Template - Variable Size
```java
int left = 0;
for (int right = 0; right < n; right++) {
    // expand window with arr[right]
    while (windowConditionViolated) {
        // shrink window with arr[left]
        left++;
    }
    // update result
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Max Consecutive Ones | arrays/MaxConsecutiveOnes | Easy |
| Max Sum Subarray of Size K | sliding_window/FixedSizeSlidingWindow | Easy |
| Longest Substring Without Repeating Characters | sliding_window/LongestSubstringWithoutRepeating | Medium |
| Max Points from Cards | sliding_window/MaxPointFromCard | Medium |
| Variable Size Sliding Window | sliding_window/VariableSizeSlidingWindow | Medium |
