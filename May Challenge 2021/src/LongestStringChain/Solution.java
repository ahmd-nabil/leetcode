package LongestStringChain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int longestStrChain(String[] words) {
        List<String>[] A = new ArrayList[1001];
        Map<String, Integer> map = new HashMap<>();
        map.put("", 0);
        A[0].add("");
        for (String word : words) {
            A[word.length()].add(word);
            map.put(word, 1);
        }
        int ans = 1;
        for(int i=0; i<1000; i++) {
            for(String pre: A[i]) {    // N * N * L
                for(String nxt: A[i+1]) {
                    if(predecessor(pre, nxt)) {
                        map.put(nxt, Math.max(map.get(nxt), map.get(pre) + 1));
                        ans = Math.max(ans, map.get(nxt));
                    }
                }
            }
        }
        return ans;
    }

    private boolean predecessor(String s1, String s2) {
        if(s1.length() != s2.length() - 1) return false;
        if(s1.length() == 0) return true;
        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                ++i;
            } else if(j > i){
                return false;
            }
            ++j;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}