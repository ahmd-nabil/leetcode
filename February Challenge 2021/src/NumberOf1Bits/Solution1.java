package NumberOf1Bits;

/***
 * Loop over all bits and if it's a 1 then increase ans by 1
 ***/
public class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0) {
            ans += (n&1);
            n >>>= 1;
        }
        return ans;
    }
}
