package ConcatenationOfConsecutiveBinaryNumbers;

public class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int mod = 1_000_000_007;

        for(int i=1; i<=n; i++) {
            System.out.println((res << Integer.toBinaryString(i).length()) + i);
            res = ((res << Integer.toBinaryString(i).length()) + i) % mod;
        }
        return (int)res;
    }
}
