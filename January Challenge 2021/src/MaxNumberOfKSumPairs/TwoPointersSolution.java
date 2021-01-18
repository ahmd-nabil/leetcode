package MaxNumberOfKSumPairs;

import java.util.Arrays;

public class TwoPointersSolution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;

        int l = 0, r = nums.length - 1;

        while(l < r) {
            if(nums[l] + nums[r] < k)
                l++;
            else if(nums[l] + nums[r] > k)
                r--;
            else {
                l++;
                r--;
                ans++;
            }
        }
        return ans;
    }
}
