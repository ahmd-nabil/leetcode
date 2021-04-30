package PowerOfThree;

public class BaseConversionSolution {
    public boolean isPowerOfThree(int n) {
        /** checking if the string starts with 1 ^1, is followed by zero or more 0s 0* and contains nothing else ＄*/
        return Integer.toString(n, 3).matches("^10*$");
    }
}
