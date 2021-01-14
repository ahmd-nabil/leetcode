package RotateImage;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n/2; i++) {
            int[] tempRow = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] = tempRow;
        }

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
