package VowelSpellchecker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> set = new HashSet<>(Arrays.asList(wordlist));
        String[] res = new String[queries.length];
        for(int i=0; i<res.length; i++)
            res[i] = "";

        for(int i=0; i<queries.length; i++) {
            String query = queries[i];
            if(set.contains(query))
                res[i] = query;
            else {
                for(String s: wordlist) {
                    if(matches(s, query)) {
                        res[i] = s;
                        break;
                    }
                }
            }
        }
        return res;
    }

    private boolean matches(String s, String query) {
        if(s.length() != query.length()) return false;
        for(int i=0; i<query.length(); i++) {
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(query.charAt(i));
            if(c1 != c2 && (!vowels.contains(c1) || !vowels.contains(c2)))
                return false;
        }
        return true;
    }
}
