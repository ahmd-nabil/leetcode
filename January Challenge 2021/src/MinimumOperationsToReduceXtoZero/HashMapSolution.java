package MinimumOperationsToReduceXtoZero;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int n: nums)
            totalSum += n;

        int target = totalSum - x;
        if(target == 0) return nums.length;

        Map<Integer, Integer> map = new HashMap<>(); // to keep track of prev cumulative sum
        map.put(0, -1);
        int sum = 0;    // to keep track of total sum till current index
        int size = -1;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - target))
                size = Math.max(size, i - map.get(sum - target));
            map.put(sum, i);
        }

        return size == -1 ? -1: nums.length - size;
    }
}
/**
 * If it exists an answer, then it means we have a subarray in the middle of original array whose sum is == totalSum - x
 * If we want to minimize our operations, then we should maximize the length of the middle subarray.
 * Then the question becomes: Find the Longest Subarray with Sum Equals to TotalSum - X
 **/

/** the tricky logic is here ((if we have currentSum - prevSum equals target then we have subarray in the mid that sums to target))
    curCumulativeSum - prevCumulativeSum = target => there is a subarray that sums to target (try to draw it to get it clear)
 **/