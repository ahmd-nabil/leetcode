package KthLargestElementInArray;

import java.util.Arrays;

public class SortingSolution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
