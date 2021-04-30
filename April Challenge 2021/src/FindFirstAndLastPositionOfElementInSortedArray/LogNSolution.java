package FindFirstAndLastPositionOfElementInSortedArray;

public class LogNSolution {
    // O(log(n)) solution
    public int[] searchRange(int[] nums, int target) {
        int first = binSearchEqualOrGreater(nums, 0, nums.length, target);
        if(first >= nums.length || nums[first] != target )
            return new int[] {-1,-1};
        int last = binSearchEqualOrGreater(nums, first, nums.length, target+1) - 1;
        return new int[]{first, last};
    }

    public int binSearchEqualOrGreater(int[] nums, int i, int j, int target) {
        while(i < j) {
            int mid =  ((j - i) >> 1) + i;
            if(nums[mid] < target)
                i = mid + 1;
            else
                j = mid;
        }
        return i;
    }
}
