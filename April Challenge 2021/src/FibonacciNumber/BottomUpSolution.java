package FibonacciNumber;

public class BottomUpSolution {
    public int fib(int n) {
        if(n < 2) return n;
        int a = 0, b = 1;
        for(int i=2; i<n; i++) {
            int c = b + a;
            a = b;
            b = c;
        }
        return a + b;
    }
}
