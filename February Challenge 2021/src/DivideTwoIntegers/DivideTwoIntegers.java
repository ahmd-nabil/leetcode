package DivideTwoIntegers;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int a = Math.abs(dividend), b = Math.abs(divisor), ans = 0;
        for(int i = 31; i>=0; i--) {
            if((a >>> i) - b >= 0) {
                ans += 1 << i;
                a -= b << i;
            }
        }
        return sign(dividend, divisor) == 1 ? ans : -ans;
    }

    private int sign(int dividend, int divisor) {
        if((dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0))
            return -1;
        return 1;
    }
}
