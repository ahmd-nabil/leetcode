package NextPermutation;
/**
 * You search backwards for the first decreasing number (i)
 * then search for the best replacement (the minimum number bigger than it (j) )
 * reverse the array from i,end
 * **/

public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i == -1) {
            reverse(nums, 0, nums.length-1);
        }
        else {
            int j = i + 1;
            while(j < nums.length-1 && nums[j+1] > nums[i]) {
                j++;
            }
            swap(nums, i, j);
            reverse(nums, i+1, nums.length-1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++; end--;
        }
    }

    private void swap(int[] nums,int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
