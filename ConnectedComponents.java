import java.util.*;

public class ConnectedComponents {
    static void dfs(List<List<Integer>> g, boolean[] vis, int node) {
        vis[node] = true;
        for (int nbr : g.get(node))
            if (!vis[nbr]) dfs(g, vis, nbr);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());
        
        g.get(0).add(1); g.get(1).add(0);
        g.get(1).add(2); g.get(2).add(1);
        g.get(3).add(4); g.get(4).add(3);
        
        boolean[] vis = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++)
            if (!vis[i]) {
                dfs(g, vis, i);
                count++;
            }

        System.out.println("Connected Components: " + count);
    }
}
