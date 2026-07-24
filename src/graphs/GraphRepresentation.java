// Pattern: Graph Representation (Adjacency List + Matrix)
// Difficulty: Easy

import java.util.*;

class GraphRepresentation {
    int V;
    List<List<Integer>> adjList;
    int[][] adjMatrix;

    public GraphRepresentation(int V) {
        this.V = V;
        this.adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) adjList.add(new ArrayList<>());
        this.adjMatrix = new int[V][V];
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public void addDirectedEdge(int u, int v) {
        adjList.get(u).add(v);
        adjMatrix[u][v] = 1;
    }
}