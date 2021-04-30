package NumberOfSubmatricesThatSumToTarget;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, res = 0;
        for(int r=0; r<m; r++) {
            for(int c=1; c<n; c++) {
                matrix[r][c] += matrix[r][c-1];
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int c1=0; c1<n; c1++) {
            for(int c2=c1; c2<n; c2++) {
                map.clear(); map.put(0,1);
                int cur = 0;
                for(int r=0; r<m; r++) {
                    cur += matrix[r][c2] - (c1 > 0 ? matrix[r][c1-1] : 0);
                    res += map.getOrDefault(cur - target, 0);
                    map.put(cur, map.getOrDefault(cur, 0) + 1);
                }
            }
        }
        return res;
    }
}
