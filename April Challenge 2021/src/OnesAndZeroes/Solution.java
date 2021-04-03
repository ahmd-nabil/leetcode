package OnesAndZeroes;

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length+1][m+1][n+1];
        int[] c = new int[]{0,0};
        for(int i=1; i<=strs.length;i++) {
            String s = strs[i-1];
            c = count(s);
            for(int j=0; j<=m; j++) {
                for(int k=0; k<=n; k++) {
                    if(j >= c[0] && k >= c[1])
                        dp[i][j][k] = Math.max(dp[i-1][j][k], 1 + dp[i-1][j-c[0]][k-c[1]]);
                    else
                        dp[i][j][k] = dp[i-1][j][k];
                }
            }
        }
        return dp[strs.length][m][n];
    }

    private int[] count(String s) {
        int[] A = new int[2];
        for(char c: s.toCharArray()) {
            if(c == '0')
                A[0]++;
            else
                A[1]++;
        }
        return A;
    }
}