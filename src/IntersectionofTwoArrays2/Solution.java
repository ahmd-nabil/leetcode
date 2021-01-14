package IntersectionofTwoArrays2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums2)
            map.put(n, map.getOrDefault(n, 0) + 1);

        List<Integer> tempList = new ArrayList<>();
        for(int n : nums1) {
            if(map.containsKey(n)) {
                int freq = map.get(n);
                if(freq > 0)
                    tempList.add(n);
                map.put(n, freq-1);
            }
        }

        int[] res = new int[tempList.size()];
        for(int i=0; i<res.length; i++)
            res[i] = tempList.get(i);
        return res;
    }
}
