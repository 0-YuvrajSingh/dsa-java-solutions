# Union-Find (DSU) Pattern

## When to Use
- Connected components in graph
- Cycle detection in undirected graph
- Dynamic connectivity queries

## Template
```java
class UnionFind {
    int[] parent, rank;
    UnionFind(int n) {
        parent = new int[n]; rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    void union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return;
        if (rank[px] < rank[py]) parent[px] = py;
        else if (rank[px] > rank[py]) parent[py] = px;
        else { parent[py] = px; rank[px]++; }
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Union Find DS | graphs/UnionFindDS | Medium |
| Kruskal's MST | graphs/KruskalsMST | Medium |
| Longest Consecutive Sequence | arrays/LongestConsecutiveSequence | Medium |
