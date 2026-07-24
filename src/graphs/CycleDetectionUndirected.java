// Pattern: BFS (Cycle Detection in Undirected Graph)
// Difficulty: Medium

import java.util.*;

class CycleDetectionUndirected {
    public boolean hasCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i] && bfsCheck(adj, i, visited)) return true;
        }
        return false;
    }

    private boolean bfsCheck(List<List<Integer>> adj, int start, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, -1});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int node = pair[0], parent = pair[1];

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) return true;
            }
        }
        return false;
    }
}