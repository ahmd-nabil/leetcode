package NonDecreasingArray;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean modified = false;
        for(int i=0; i <= nums.length - 2; i++) {
            if(nums[i] > nums[i+1]) {
                if(modified)
                    return false;
                if(i >= 1 && nums[i+1] >= nums[i-1]) nums[i] = nums[i+1];
                else if(i >= 1 && nums[i+1] < nums[i-1]) nums[i+1] = nums[i];
                modified = true;
            }
        }
        return true;
    }
}
