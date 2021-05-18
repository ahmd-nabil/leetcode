package LongestStringChain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    // Accepted
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length)); // N * log(N)
        Map<String, Integer> map = new HashMap<>();
        int ans = 1;
        for(String word: words) {    // N * L * L
            int curr = 1;
            for(int i=0; i<word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String predecessor = sb.toString();
                curr = Math.max(curr, map.getOrDefault(predecessor, 0) + 1);
            }
            map.put(word, curr);
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
