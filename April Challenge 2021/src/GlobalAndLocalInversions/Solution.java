package GlobalAndLocalInversions;

public class Solution {
    public boolean isIdealPermutation(int[] A) {
        int mx = 0;
        for(int i=0; i+2<A.length; i++) {
            mx = Math.max(mx, A[i]);
            if(mx > A[i+2])
                return false;
        }
        return true;
    }
}
