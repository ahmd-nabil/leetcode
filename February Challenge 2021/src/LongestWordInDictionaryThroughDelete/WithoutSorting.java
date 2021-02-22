package LongestWordInDictionaryThroughDelete;

import java.util.List;

public class WithoutSorting {
    public String findLongestWord(String s, List<String> d) {
        String res = "";

        for(String s2: d) {
            int i = 0;
            for(char c : s.toCharArray()) {
                if(i < s2.length() && s2.charAt(i) == c)
                    i++;
            }

            if(i == s2.length()) {
                if(s2.length() > res.length() ||
                        (s2.length() == res.length() && s2.compareTo(res) < 0))
                    res = s2;
            }
        }
        return res;
    }
}
