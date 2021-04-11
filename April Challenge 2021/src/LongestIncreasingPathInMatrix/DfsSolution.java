package LongestIncreasingPathInMatrix;

public class DfsSolution {
    int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        int[][] dp = new int[m][n];
        int ans = 1;
        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                int max = dfs(matrix, r, c, m, n, dp);
                ans = Math.max(ans, max);
            }
        }
        return ans;
    }

    private int dfs(int[][] matrix, int r, int c, int m, int n, int[][] dp) {
        if(dp[r][c] != 0) return dp[r][c];
        int max = 1;
        for(int[] dir: dirs) {
            int r1 = r+dir[0], c1 = c+dir[1];
            if(r1 < 0 || r1 >= m || c1 < 0 || c1 >= n || matrix[r1][c1] <= matrix[r][c]) continue;
            max = Math.max(max, 1 + dfs(matrix, r1, c1, m, n, dp));
        }
        dp[r][c] = max;
        return max;
    }
}
