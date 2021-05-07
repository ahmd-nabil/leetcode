package DeleteOperationForTwoStrings;

public class DpLongestCommonSequenceSolution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        lcs(word1, word2, 0, 0, dp);
        return word1.length() + word2.length() - 2 * dp[0][0];
    }

    private int lcs(String word1, String word2, int i, int j, int[][] dp) {
        if(i == word1.length() || j == word2.length()) return 0;
        if(dp[i][j] != 0) return dp[i][j];

        if(word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = 1 + lcs(word1, word2, i+1, j+1, dp);
        } else {
            dp[i][j] = Math.max(lcs(word1, word2, i+1, j, dp), lcs(word1, word2, i, j+1, dp));
        }
        return dp[i][j];
    }
}
