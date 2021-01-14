package RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n - k];

        for(int i=0; i<temp.length; i++)
            temp[i] = nums[i];

        for(int i=0; i<k; i++) {
            nums[i] = nums[n-k+i];
        }

        for(int i=0; i<temp.length; i++)
            nums[i+k] = temp[i];
    }
}
