package Triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] res = new int[n+1];

        for(int r=n-1; r>=0; r--) {
            for(int i=0; i <= r; i++) {
                res[i] = Math.min(res[i], res[i+1]) + triangle.get(r).get(i);
            }
        }
        return res[0];
    }
}
