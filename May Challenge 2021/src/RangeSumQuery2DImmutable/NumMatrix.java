package RangeSumQuery2DImmutable;

class NumMatrix {
    private int[][] A;
    public NumMatrix(int[][] matrix) {
        this.A = new int[matrix.length + 1][matrix[0].length + 1];
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                A[i+1][j+1] = A[i][j+1] + A[i+1][j] - A[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        return A[r2+1][c2+1] - A[r2+1][c1] - A[r1][c2+1] + A[r1][c1];
    }
}
