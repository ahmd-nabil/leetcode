package MaximumPointsYouCanObtainFromCards;

public class SlidingWindowSolution {
    public int maxScore(int[] A, int k) {
        int total = 0;
        for(int card: A) {
            total += card;
        }

        int window = 0, windowSize = A.length - k;
        for(int i=0; i < windowSize; i++) {
            window += A[i];
        }

        int minWindow = window;
        for(int l = 0, r = windowSize; r < A.length; l++, r++) {
            window -= A[l];
            window += A[r];
            minWindow = Math.min(minWindow, window);
        }
        return total - minWindow;
    }
}
