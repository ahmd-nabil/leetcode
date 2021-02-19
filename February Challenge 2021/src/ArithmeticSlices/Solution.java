package ArithmeticSlices;

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3) return 0;
        int round = 1;
        int ans = 0;
        for(int i=1; i<A.length; i++) {
            if(i + 1 < A.length && A[i+1] - A[i] == A[i] - A[i-1]) {
                ans += round;
                round++;
            } else {
                round = 1;
            }
        }
        return ans;
    }
}
