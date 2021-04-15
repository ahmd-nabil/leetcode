package FibonacciNumber;

public class TopDownSolution {
    public int fib(int n) {
        return fib_util(n, new int[n+1]);
    }

    private int fib_util(int n, int[] dp) {
        if(n < 2) return n;
        if(dp[n] != 0) return dp[n];
        int ans = fib_util(n-1, dp) + fib_util(n-2, dp);
        dp[n] = ans;
        return ans;
    }
}
