# Two Pointers Pattern

## When to Use
- Sorted arrays (or can be sorted)
- Pair/Triplet/FourSum problems
- Reverse operations
- Palindrome checks

## Template
```java
int left = 0, right = n - 1;
while (left < right) {
    int sum = arr[left] + arr[right];
    if (sum == target) { /* found */ left++; right--; }
    else if (sum < target) left++;
    else right--;
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Two Pointers | two_pointers/TwoPointers | Easy |
| Move All Occurrence | two_pointers/MoveAllOccurence | Easy |
| 3Sum | arrays/ThreeSum | Medium |
| Valid Palindrome | strings/ValidPalindrome | Easy |
| Remove Duplicates | arrays/RemoveDuplicates | Easy |
| Sort 012 | arrays/Sort012 | Medium |
