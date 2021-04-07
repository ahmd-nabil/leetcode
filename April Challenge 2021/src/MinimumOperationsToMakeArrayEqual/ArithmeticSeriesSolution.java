package MinimumOperationsToMakeArrayEqual;

public class ArithmeticSeriesSolution {
    public int minOperations(int n) {
        int m = n/2;
        return (n&1) == 1 ? m * (m+1) : m*m;
    }

    public int minOperations2(int n) {
        return ((n&1) == 1) ? (n * n - 1) / 4 : n * n / 4;
    }


    public int minOperations3(int n) {
        return n * n / 4;
    }
}
