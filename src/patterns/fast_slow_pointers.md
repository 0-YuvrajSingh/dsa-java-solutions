# Fast & Slow Pointers Pattern

## When to Use
- Linked list cycle detection
- Finding middle of linked list
- Detecting palindrome in linked list

## Template - Cycle Detection
```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) return true; // cycle exists
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Floyd Cycle Detection | special_algorithms/FloydCycleDetection | Medium |
| Detect Cycle | linkedlist/DetectCycle | Medium |
| Length of Loop (Optimal) | linkedlist/LengthOfLoopOptimal | Medium |
| Length of Loop (Brute) | linkedlist/Problems/LengthOfLoopBrute | Easy |
| If Palindrome (Optimal) | linkedlist/Problems/IfPalindromeOptimal | Medium |
