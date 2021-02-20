package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int prev = 0;
        for(int i=s.length() - 1; i>=0; i--) {
            int cur = map.get(s.charAt(i));
            if(cur >= prev) {
                ans += cur;
                prev = cur;
            } else {
                ans -= cur;
            }
        }
        return ans;
    }
}
