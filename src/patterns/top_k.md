# Top K Elements Pattern

## When to Use
- Kth largest/smallest
- Top K frequent elements
- Median of data stream

## Template - Min Heap for Top K
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
for (int num : nums) {
    pq.offer(num);
    if (pq.size() > k) pq.poll();
}
return pq.peek();
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Kth Largest Element | heaps/KthLargestElementInArray | Medium |
| Top K Frequent Elements | heaps/TopKFrequentElements | Medium |
| K Closest Points to Origin | heaps/KClosestPointsToOrigin | Medium |
| Median in Stream | heaps/MedianInStream | Hard |
| Merge K Sorted Lists | linkedlist/MergeKSortedLists | Hard |
| Task Scheduler | heaps/TaskScheduler | Medium |
| Boyer-Moore Majority Vote | special_algorithms/BoyerMooreMajorityVote | Medium |
