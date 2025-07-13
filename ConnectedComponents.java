// Number of Connected Components: Find the number of connected components in an undirected graph.

import java.util.*;

public class ConnectedComponents {
    static void dfs(List<List<Integer>> g, boolean[] vis, int node) { // Depth-First Search function to     explore the graph 
        vis[node] = true; // Mark the current node as visited 
        for (int nbr : g.get(node)) // Explore the neighboring nodes 
            if (!vis[nbr]) dfs(g, vis, nbr); // Recursively explore the neighboring nodes if not visited 
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices  in the graph 
        List<List<Integer>> g = new ArrayList<>(); // Graph represented as adjacency list 
        for (int i = 0; i < V; i++) g.add(new ArrayList<>()); // Initialize the graph with empty lists 
        
        g.get(0).add(1); g.get(1).add(0); // Add edges to the graph 
        g.get(1).add(2); g.get(2).add(1); 
        g.get(3).add(4); g.get(4).add(3);
        
        boolean[] vis = new boolean[V]; // Initialize the visited array with false values  
        // Perform Depth-First Search from each unvisited node in the graph 

        int count = 0; // Keep track of the number of connected components 
        for (int i = 0; i < V; i++) // Explore each unvisited node in the graph  
            if (!vis[i]) { // If the current node is not visited, perform DFS and increment the count 
                dfs(g, vis, i); // Perform DFS from the current node 
                count++; // Increment the count of connected components 
            }

        System.out.println("Connected Components: " + count);
    }
}
