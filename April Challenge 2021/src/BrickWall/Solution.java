package BrickWall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer> row: wall) {
            for(int i=1; i<row.size(); i++) {
                map.put(row.get(i-1), map.getOrDefault(row.get(i-1), 0) + 1);
                row.set(i, row.get(i-1) + row.get(i));
            }
        }
        int nonCrossed = 0;
        for(int key: map.keySet()) {
            nonCrossed = Math.max(nonCrossed, map.get(key));
        }
        return wall.size() - nonCrossed;
    }
}
