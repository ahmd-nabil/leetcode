package CheckIfAll1sAreKPlacesAway;

public class Solution {
    // if current bit equals 1 => check if distance between it and last one > k, and update last to current
    public static boolean kLengthApart(int[] nums, int k) {
        int last = -k - 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                if(i - last - 1 < k) {
                    return false;
                }
            }
            last = i;
        }
        return true;
    }
}
