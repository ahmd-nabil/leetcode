package PathWithMinimumEffort;public class DijkstraSolution {
    int[] rd = new int[] {1,0,-1,0};
    int[] cd = new int[] {0,1,0,-1};
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        int[][] dist = new int[n][m];
        for(int[] arr: dist) Arrays.fill(arr, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]); // will  be [r, c, value] key_value
        pq.offer(new int[]{0, 0, 0});

        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int r = cur[0], c = cur[1], v = cur[2];
            if(v >= dist[r][c]) continue;
            dist[r][c] = v;
            for(int i=0; i<4; i++) {
                int rm = r + rd[i], cm = c + cd[i];
                if(rm >= 0 && rm < n && cm >= 0 && cm < m) {
                    int newDist = Math.max(v, Math.abs(heights[r][c] - heights[rm][cm]));
                    if(newDist < dist[rm][cm]) {
                        pq.offer(new int[] {rm, cm, newDist});
                    }
                }
            }
        }
        return dist[n-1][m-1];
    }
}
