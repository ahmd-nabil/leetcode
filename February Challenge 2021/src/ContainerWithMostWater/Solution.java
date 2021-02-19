package ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = Math.min(height[l], height[r]) * (r-l);
        while(l < r) {
            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
            ans = Math.max(ans, Math.min(height[l], height[r]) * (r - l));
        }
        return ans;
    }
}
