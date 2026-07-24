// Pattern: Greedy (Prim's MST - Minimum Spanning Tree)
// Difficulty: Medium

import java.util.*;

class PrimsMST {
    public int prim(int V, List<List<int[]>> adj) {
        boolean[] inMST = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{0, 0});
        int totalWeight = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], w = curr[1];

            if (inMST[u]) continue;
            inMST[u] = true;
            totalWeight += w;

            for (int[] edge : adj.get(u)) {
                int v = edge[0], weight = edge[1];
                if (!inMST[v]) pq.offer(new int[]{v, weight});
            }
        }
        return totalWeight;
    }
}