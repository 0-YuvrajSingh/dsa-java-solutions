# Merge Intervals Pattern

## When to Use
- Overlapping intervals
- Insert interval
- Meeting rooms

## Template
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> merged = new ArrayList<>();
for (int[] interval : intervals) {
    if (merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]) {
        merged.add(interval);
    } else {
        merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]);
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Non-Overlapping Intervals | greedy/NonOverlappingIntervals | Medium |
| Activity Selection | greedy/ActivitySelection | Medium |
| Count Inversions | arrays/CountInversions | Medium |
