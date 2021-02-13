package ShortestPathInBinaryMatrix;

import java.util.LinkedList;
import java.util.Queue;

/*
* Why Not DP ??
Simple Answer, you shouldn't use dp for overlapping subproblems(here you can move backward in all 8 directions so dp doesn't work)

Check this example:
[
[0,1,0,0,0],
[0,1,0,1,0],
[0,1,0,1,0],
[0,1,0,1,0],
[0,0,0,1,0]
]

* IF DP, you will visit grid[0][2] before getting to grid[1][2] => dp[0][2] will be MAX_VALUE
* You may say dp[0][2] will be updated in the future when checking grid[1][2], that's true
* But dp[0][3], dp[0][4] are already MAX, then, all last column cells would be MAX
* then answer would be -1
*/
public class BFS {
    int[] DIRS = {1,-1,0};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0,0});
        grid[0][0] = 1;

        int ans = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                int[] cell = q.poll();
                int r = cell[0], c = cell[1];
                if(r == n-1 && c == n-1) return ans;
                for(int rd : DIRS) {
                    for(int cd : DIRS) {
                        if(rd == 0 && cd == 0) continue;
                        int nr = r + rd, nc = c + cd;
                        if(nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0) {
                            q.add(new int[]{nr, nc});
                            grid[nr][nc] = 1;
                        }
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}
