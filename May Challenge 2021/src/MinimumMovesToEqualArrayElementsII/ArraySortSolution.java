package MinimumMovesToEqualArrayElementsII;

import java.util.Arrays;

public class ArraySortSolution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int l = 0, r = nums.length - 1;
        while(l < r) {
            ans += nums[r] - nums[l];
            l++; r--;
        }
        return ans;
    }
}
