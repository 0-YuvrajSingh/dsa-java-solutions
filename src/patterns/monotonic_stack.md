# Monotonic Stack Pattern

## When to Use
- Next Greater/Smaller Element
- Histogram problems
- Stock span problems

## Template - Next Greater Element
```java
Deque<Integer> stack = new ArrayDeque<>();
int[] result = new int[n];
for (int i = n - 1; i >= 0; i--) {
    while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) stack.pop();
    result[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
    stack.push(i);
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Next Greater Element I | stack_queue/NextGreaterElementI | Easy |
| Next Greater Element II | stack_queue/NextGreaterElementII | Medium |
| Smaller Element | stack_queue/Problems/SmallerElement | Medium |
| Greater Element | stack_queue/Problems/GreaterElement | Medium |
| Largest Rectangle in Histogram | stack_queue/LargestRectangleInHistogramLC | Hard |
| Maximal Rectangle | stack_queue/MaximalRectangleLC | Hard |
| Min Stack | stack_queue/MinStackLC | Medium |
| Sum of Subarray Ranges | stack_queue/Special/SumOfSubArrayRanges | Medium |
| Sum of Subarray Minimums | stack_queue/Problems/SumOfSubArrayMinimum | Medium |
| Sum of Subarray Maximums | stack_queue/Problems/SumOfSubArrayMaximum | Medium |
