package FindAndReplacePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String word: words) {
            if(match(word, pattern))
                res.add(word);
        }
        return res;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            char c1 = word.charAt(i), c2 = pattern.charAt(i);
            if((map1.containsKey(c1) && map1.get(c1) != c2) || (map2.containsKey(c2) && map2.get(c2) != c1))
                return false;
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        return true;
    }
}
