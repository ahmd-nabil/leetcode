package ShortestDistanceToCharacter;

import java.util.Arrays;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        Arrays.fill(ans, n);
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == c) ans[i] = 0;
            else if(i > 0) ans[i] = Math.min(ans[i], ans[i-1] + 1);
        }

        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == c) ans[i] = 0;
            else if (i < n-1) ans[i] = Math.min(ans[i], ans[i+1] + 1);
        }

        return ans;
    }
}
