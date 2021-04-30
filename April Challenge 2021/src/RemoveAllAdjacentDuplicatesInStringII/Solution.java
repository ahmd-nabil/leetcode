package RemoveAllAdjacentDuplicatesInStringII;

public class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int prevLength = Integer.MAX_VALUE;
        int curLength = sb.length();
        while(curLength < prevLength) {
            for(int i=0; i <= sb.length()-k;) {
                if (same(sb, i, i + k)) {
                    sb.delete(i, i + k);
                } else {
                    i++;
                }
            }
            prevLength = curLength;
            curLength = sb.length();
        }
        return sb.toString();
    }

    private boolean same(StringBuilder sb, int start, int end) {
        for(int i=start; i<end-1; i++) {
            if(sb.charAt(i) != sb.charAt(i+1))
                return false;
        }
        return true;
    }
}
