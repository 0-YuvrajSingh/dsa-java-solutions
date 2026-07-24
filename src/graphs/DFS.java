// Pattern: DFS (Depth-First Search Traversal)
// Difficulty: Medium

import java.util.*;

class DFS {
    public List<Integer> dfs(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        List<Integer> result = new ArrayList<>();
        dfsHelper(adj, start, visited, result);
        return result;
    }

    private void dfsHelper(List<List<Integer>> adj, int node, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(adj, neighbor, visited, result);
            }
        }
    }

    public List<Integer> dfsIterative(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        List<Integer> result = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (visited[node]) continue;
            visited[node] = true;
            result.add(node);
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) stack.push(neighbor);
            }
        }
        return result;
    }
}