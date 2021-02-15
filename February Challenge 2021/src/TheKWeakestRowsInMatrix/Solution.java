package TheKWeakestRowsInMatrix;

import java.util.PriorityQueue;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> a[1] != b[1]? a[1] - b[1] : a[0] - b[0]);
        for(int i=0; i<m; i++) {
            pq.add(new int[]{i,countSoldiers(mat[i])});
        }

        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;
    }

    private int countSoldiers(int[] row) {
        int l = 0;
        int r = row.length;

        while(l < r) {
            int m = l + (r - l) / 2;

            if(row[m] == 1)
                l = m + 1;
            else
                r = m;

        }
        return l;
    }
}
