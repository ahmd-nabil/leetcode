package RestoreTheArrayFromAdjacentPairs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] restoreArray(int[][] adjacent) {
        int n = adjacent.length + 1;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] pair: adjacent) {
            map.putIfAbsent(pair[0], new HashSet<>());
            map.putIfAbsent(pair[1], new HashSet<>());
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }

        int[] res = new int[n];
        for(int i: map.keySet()) {
            if(map.get(i).size() == 1) {
                res[0] = i;
                break;
            }
        }

        for(int i = 0; i < n-1; i++) {
            for(int adj: map.get(res[i])) {
                if(i-1 < 0 || adj != res[i-1]) {
                    res[i+1] = adj;
                }
            }
        }
        return res;
    }
}