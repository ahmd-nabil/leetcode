package MaximumAbsoluteSumOfAnySubarray;

public class KadaneSolution {
    public int maxAbsoluteSum(int[] nums) {
        int posAns = 0;
        int cur = 0;
        for(int i=0; i<nums.length; i++) {
            if(cur + nums[i] > 0) cur += nums[i];
            else cur = 0;
            posAns = Math.max(posAns, cur);
        }

        int negAns = 0;
        cur = 0;
        for(int i=0; i<nums.length; i++) {
            if(cur + nums[i] < 0) cur += nums[i];
            else cur = 0;
            negAns = Math.min(negAns, cur);
        }
        return Math.max(posAns, -negAns);
    }
}
