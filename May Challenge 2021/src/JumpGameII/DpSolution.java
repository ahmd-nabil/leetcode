package JumpGameII;

public class DpSolution {
    // O(n^2)
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        Integer[] dp = new Integer[nums.length];
        dp[0] = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=1; j <= nums[i] && i + j < nums.length; j++) {
                if(dp[i+j] != null) dp[i + j] = Math.min(dp[i+j], dp[i] + 1);
                else dp[i+j] = dp[i] + 1;
            }
        }
        return dp[nums.length - 1];
    }
}
