package WiggleSubsequence;

public class dpSolution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n < 2) return n;

        int[] up = new int[n];
        int[] down = new int[n];
        up[0] = down[0] = 1;

        for(int i=1; i<n; i++) {
            if(nums[i] < nums[i-1]) {
                down[i] = up[i-1] + 1;
                up[i] = up[i-1];
            } else if(nums[i] > nums[i-1]) {
                up[i] = down[i-1] + 1;
                down[i] = down[i-1];
            } else {
                down[i] = down[i-1];
                up[i] = up[i-1];
            }
        }
        return Math.max(down[n-1], up[n-1]);
    }
}
