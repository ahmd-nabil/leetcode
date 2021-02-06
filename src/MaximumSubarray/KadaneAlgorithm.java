package MaximumSubarray;

public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int cur = 0;
        for(int i=0; i<nums.length; i++) {
            if(cur + nums[i] > 0) {
                cur += nums[i];
                ans = Math.max(ans, cur);
            } else {
                cur = 0;
                ans = Math.max(ans, nums[i]);
            }
        }
        return ans;
    }
}
