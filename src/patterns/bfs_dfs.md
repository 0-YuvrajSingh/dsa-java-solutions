# BFS / DFS Pattern

## When to Use
- Level-order traversal of trees
- Shortest path in unweighted graphs
- Connected components
- Cycle detection in graphs

## BFS Template
```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(start);
visited[start] = true;
while (!queue.isEmpty()) {
    int node = queue.poll();
    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
            visited[neighbor] = true;
            queue.offer(neighbor);
        }
    }
}
```

## DFS Template
```java
void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
    visited[node] = true;
    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) dfs(neighbor, visited, adj);
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| BFS | graphs/BFS | Medium |
| DFS | graphs/DFS | Medium |
| Number of Islands | graphs/NumberOfIslands | Medium |
| Topological Sort | graphs/TopologicalSort | Medium |
| Cycle Detection (Directed) | graphs/CycleDetectionDirected | Medium |
| Cycle Detection (Undirected) | graphs/CycleDetectionUndirected | Medium |
| Course Schedule | graphs/CourseSchedule | Medium |
| Word Ladder | graphs/WordLadder | Hard |
| Level Order Traversal | trees/LevelOrderTraversal | Easy |
| Tree Views (Left/Right/Top/Bottom) | trees/ViewsOfTree | Medium |
| Rat in a Maze | recursion_backtracking/RatInMazeSolver | Medium |
