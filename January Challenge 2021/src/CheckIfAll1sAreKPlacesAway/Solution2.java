package CheckIfAll1sAreKPlacesAway;

public class Solution2 {
    // count all zeros until next one => check if zeros >= k
    public static boolean kLengthApart(int[] nums, int k) {
        int zerosCount = k;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0)
                zerosCount++;
            else if (nums[i] == 1) {
                if(zerosCount < k)
                    return false;
                zerosCount = 0;
            }
        }
        return true;
    }
}
