package RemoveDuplicatesFromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // loop with i, insert at j
        int len = 0;
        for(int i=0, j=0; i<nums.length;) {
            while(i < nums.length - 1 && nums[i] == nums[i+1])
                i++;
            nums[j++] = nums[i++];
            len++;
        }
        return len;
    }
}
