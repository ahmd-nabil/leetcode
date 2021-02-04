package LongestHarmoniousSubsequence;

import java.util.HashMap;
import java.util.Map;

public class MapSolution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        int ans = 0;
        for(int key: map.keySet()) {
            if(map.containsKey(key + 1)) {
                ans = Math.max(ans, map.get(key) + map.get(key+1));
            }
        }
        return ans;
    }
}
