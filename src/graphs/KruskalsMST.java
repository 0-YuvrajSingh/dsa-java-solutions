// Pattern: Greedy + Union-Find (Kruskal's MST)
// Difficulty: Medium

import java.util.*;

class KruskalsMST {
    public int kruskal(int V, int[][] edges) {
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        UnionFind uf = new UnionFind(V);
        int totalWeight = 0;
        int count = 0;

        for (int[] edge : edges) {
            if (uf.find(edge[0]) != uf.find(edge[1])) {
                uf.union(edge[0], edge[1]);
                totalWeight += edge[2];
                count++;
                if (count == V - 1) break;
            }
        }
        return totalWeight;
    }

    private class UnionFind {
        int[] parent, rank;
        UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
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
}