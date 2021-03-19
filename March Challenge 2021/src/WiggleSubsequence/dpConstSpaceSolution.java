package WiggleSubsequence;

public class dpConstSpaceSolution {
    public int wiggleMaxLength(int[] nums) {
        int down =1, up = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[i-1])
                up = down + 1;
            else if(nums[i] < nums[i-1])
                down = up + 1;
        }
        return Math.max(down, up);
    }
}
