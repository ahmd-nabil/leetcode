package MaxNumberOfKSumPairs;

import java.util.HashMap;
import java.util.Map;

public class MapSolution {
    // Readable solution
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for(int n: nums)
            count.put(n, count.getOrDefault(n, 0) + 1);

        for(int n: count.keySet()) {
            if(n*2 < k)
                ans += Math.min(count.get(n), count.getOrDefault(k-n, 0));
        }

        if((k&1) == 0) ans += count.getOrDefault(k/2, 0) / 2;
        return ans;
    }
}

/** 1 loop Solution:
 *
 * public int maxOperations(int[] nums, int k) {
 *         int ans = 0;
 *         Map<Integer, Integer> map = new HashMap<>();
 *
 *         for(int x: nums) {
 *             if(map.getOrDefault(k-x, 0) > 0) {
 *                 map.put(k-x, map.get(k-x) - 1);
 *                 ans++;
 *             } else {
 *                 map.put(x, map.getOrDefault(x, 0)+1);
 *             }
 *         }
 *
 *         return ans;
 * }
 */
