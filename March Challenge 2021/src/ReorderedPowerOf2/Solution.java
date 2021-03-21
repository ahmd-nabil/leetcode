package ReorderedPowerOf2;

import java.util.Arrays;

public class Solution {
    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        for(int i=0; i<30; i++) {
            if(Arrays.equals(A, count(1<<i)))
                return true;
        }
        return false;
    }

    private int[] count(int n) {
        int[] count = new int[10];
        while(n > 0) {
            count[n%10]++;
            n /= 10;
        }
        return count;
    }
}
