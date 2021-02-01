package NumberOf1Bits;

/***
 * This trick removes the last one in the binary representation
 * */
public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0) {
            n &= (n-1);
            ans++;
        }
        return ans;
    }
}
