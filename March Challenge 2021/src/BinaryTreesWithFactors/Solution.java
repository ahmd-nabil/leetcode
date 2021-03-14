package BinaryTreesWithFactors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        long ans = 0, mod = (long) 1e9 + 7;
        Map<Integer, Long> dp = new HashMap<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            dp.put(arr[i], 1L);
            for(int j=0; j<i; j++) {
                if(arr[i] % arr[j] == 0)
                    dp.put(arr[i], (dp.get(arr[i]) + dp.get(arr[j])*dp.getOrDefault(arr[i]/arr[j], 0L))%mod);
            }
            ans = (ans + dp.get(arr[i])) % mod;
        }
        return (int)ans;
    }
}
