package MinimumOperationsToMakeArrayEqual;

// Get the sum of the right side, and sum or left side
// minimum operations = (rightSideSum - leftSideSum) / 2
public class DiffSolution {
    public int minOperations(int n) {
        int m = n / 2 ;
        // left side
        int mn = 1;
        int mx = 2 * (m-1) + 1;
        int leftSideSum = (int)(0.5 * m * (mx + mn));
        // right side
        mn = ((n&1) == 1)? mx + 4 : mx + 2;
        mx = 2 * (n-1) + 1;
        int rightSideSum = (int)(0.5 * m * (mx + mn));
        return (rightSideSum - leftSideSum)/2;
    }
}
