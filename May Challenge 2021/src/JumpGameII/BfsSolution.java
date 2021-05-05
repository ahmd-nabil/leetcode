package JumpGameII;

public class BfsSolution {
    // O(n)
    public int jump(int[] nums) {
        int jumps = 0, curEnd = 0, furthest = 0;
        for(int i=0; i < nums.length-1; i++) {
            furthest = Math.max(furthest, i + nums[i]);
            if(i == curEnd) {
                ++jumps;
                curEnd = furthest;
            }
        }
        return jumps;
    }
}
