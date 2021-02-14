package IsGraphBipartite;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            if(colors[i] != 0) continue;
            q.offer(i);
            colors[i] = 1;
            while(!q.isEmpty()) {
                int cur = q.poll();
                for(int next : graph[cur]) {
                    if(colors[next] == 0) {
                        colors[next] = -colors[cur];
                        q.offer(next);
                    } else if(colors[next] == colors[cur]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
