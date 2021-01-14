package MinimumOperationsToReduceXtoZero;

import java.util.Arrays;

public class SlidingWindowSolution {
    public int minOperations(int[] nums, int x) {

        int target = Arrays.stream(nums).sum() - x;
        int size = -1;

        int windowSum = 0;

        int i = 0;
        for(int j=0; j<nums.length; j++) {
            windowSum += nums[j];

            while(i <= j && windowSum > target)
                windowSum -= nums[i++];

            if(windowSum == target)
                size = Math.max(size, j - i + 1);
        }

        return size == -1 ? -1: nums.length - size;
    }
}
/**
 * If it exists an answer, then it means we have a subarray in the middle of original array whose sum is == totalSum - x
 * If we want to minimize our operations, then we should maximize the length of the middle subarray.
 * Then the question becomes: Find the Longest Subarray with Sum Equals to TotalSum - X
 **/

 /**
 * Move the sliding window that starts at i and ends at j where it's sum equals target
 **/
