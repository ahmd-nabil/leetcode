package UniquePathsII;

public class Solution {
    public int uniquePathsWithObstacles(int[][] A) {
        int m = A.length, n = A[0].length;
        if(A[0][0] == 1 || A[m-1][n-1] == 1) return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                if(c+1 < n && A[r][c+1] == 0) dp[r][c+1] += dp[r][c];
                if(r+1 < m && A[r+1][c] == 0) dp[r+1][c] += dp[r][c];
            }
        }
        return dp[m-1][n-1];
    }
}
