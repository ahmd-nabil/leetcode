package ShortEncodingOfWords;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveSuffixes {
    public int minimumLengthEncoding(String[] words) {
        // remove duplicates because if x.equals(y), then, x is suffix for y and vice versa
        Set<String> set = new HashSet<>(Arrays.asList(words));

        // remove all smaller suffix for each word
        for(String word: words) {
            for(int i=1; i<word.length(); i++) {
                set.remove(word.substring(i));
            }
        }
        // all the remaining words are not suffix of each other
        int res = 0;
        for(String word: set) {
            res += word.length() + 1;
        }
        return res;
    }
}
