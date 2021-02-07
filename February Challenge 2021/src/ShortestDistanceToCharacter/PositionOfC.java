package ShortestDistanceToCharacter;

/**
 *pos: Keeps track of the last appearance of C,
 * going from left to right, dist = i - pos
 * going from right to left, dist = pos - i
 * */
public class PositionOfC {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int pos = -n;
        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == c) pos = i;
            ans[i] = i - pos;
        }

        pos = 2*n;
        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == c) pos = i;
            ans[i] = Math.min(ans[i], pos - i);
        }

        return ans;
    }
}
