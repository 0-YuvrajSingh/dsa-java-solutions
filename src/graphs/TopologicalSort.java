// Pattern: DFS / BFS (Topological Sort - Kahn's Algorithm)
// Difficulty: Medium

import java.util.*;

class TopologicalSort {
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) inDegree[neighbor]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        int[] result = new int[V];
        int idx = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result[idx++] = node;
            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }
        return idx == V ? result : new int[0];
    }
}