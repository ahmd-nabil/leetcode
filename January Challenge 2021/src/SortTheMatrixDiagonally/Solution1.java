package SortTheMatrixDiagonally;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution1 {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for(int d=0; d<n+m-1; d++) {
            Queue<Integer> queue = new PriorityQueue<>();
            int startI = d < n ? n-d-1 : 0;
            int startJ = d < n ? 0 : d - n;

            int i = startI, j = startJ;
            while(i < n && j < m) {
                queue.add(mat[i++][j++]);
            }

            i = startI;
            j = startJ;
            while(j< n && i < m) {
                mat[i++][j++] = queue.poll();
            }
        }
        return mat;
    }
}
