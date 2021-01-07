package LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastFound = new int[256];
        Arrays.fill(lastFound, -1);
        int j = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(lastFound[c] != -1) {
                while(s.charAt(j) != c) {
                    lastFound[s.charAt(j)] = -1;
                    j++; // shrink the window from start until duplicated value found
                }
                j++; // shrink the value that is duplicated
            }
            lastFound[c] = i;
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}
