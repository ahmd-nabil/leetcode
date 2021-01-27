package MinimumPathSum;

import java.util.Arrays;

public class dpMemoSolution {

    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] arr: dp) Arrays.fill(arr, Integer.MAX_VALUE);

        dp[0][0] = grid[0][0];
        for(int i=0 ; i < n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(i+1 < n) dp[i+1][j] = Math.min(dp[i+1][j], grid[i+1][j]+dp[i][j]);
                if(j+1 < m) dp[i][j+1] = Math.min(dp[i][j+1], grid[i][j+1]+dp[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
}
