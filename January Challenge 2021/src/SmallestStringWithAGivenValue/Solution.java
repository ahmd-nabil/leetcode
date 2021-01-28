package SmallestStringWithAGivenValue;

public class Solution {
    public String getSmallestString(int n, int k) {
        char[] s = new char[n];
        int c = 26;

        for(int i=n-1; i>=0; i--) {
            while(k - c < i) {
                c--;
            }
            s[i] = (char) (c - 1 + 'a');
            k -= c;
        }
        return new String(s);
    }
}
