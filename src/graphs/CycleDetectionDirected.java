// Pattern: DFS (Cycle Detection in Directed Graph)
// Difficulty: Medium

import java.util.*;

class CycleDetectionDirected {
    public boolean hasCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] recursionStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i] && dfs(adj, i, visited, recursionStack)) return true;
        }
        return false;
    }

    private boolean dfs(List<List<Integer>> adj, int node, boolean[] visited, boolean[] recursionStack) {
        visited[node] = true;
        recursionStack[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(adj, neighbor, visited, recursionStack)) return true;
            } else if (recursionStack[neighbor]) return true;
        }
        recursionStack[node] = false;
        return false;
    }
}