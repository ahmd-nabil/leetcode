package ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class SortingSolution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        int lo = -1, hi = nums.length;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != sortedNums[i]) {
                if(lo == -1)
                    lo = i;
                else
                    hi = i;
            }
        }
        return lo == -1 ? 0 : hi - lo + 1;
    }
}
