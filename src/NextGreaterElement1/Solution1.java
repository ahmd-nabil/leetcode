package NextGreaterElement1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // maps elements from nums2 to their index
        for(int i=0; i<nums2.length; i++)
            map.put(nums2[i], i);

        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        for(int i=0; i<nums1.length; i++) {
            int x = nums1[i];
            for(int j=map.get(x)+1; j<nums2.length; j++) {
                if(nums2[j] > x) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
// O(M) + O(n * (M-j)) NOT sure about it :D
