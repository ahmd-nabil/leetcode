package CountBinarySubstrings;

public class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0;
        int a = 1, b = 0;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1))
                a++;
            else {
                res += Math.min(a, b);
                b = a;
                a = 1;
            }
        }
        return res + Math.min(a, b);
    }
}
