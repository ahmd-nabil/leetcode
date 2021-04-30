package RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; 2*i < n ; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tmp;
        }

        for(int r = 0; r<n; r++) {
            for(int c=r+1; c<n; c++) {
                int tmp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = tmp;
            }
        }
    }
}
