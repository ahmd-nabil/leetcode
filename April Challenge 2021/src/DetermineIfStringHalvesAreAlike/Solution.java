package DetermineIfStringHalvesAreAlike;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int d = 0;
        for(int i=0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                d += 2 * i < s.length() ? 1 : -1;
            }
        }
        return d == 0;
    }
}
