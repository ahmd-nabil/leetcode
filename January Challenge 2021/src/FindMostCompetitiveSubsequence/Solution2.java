package FindMostCompetitiveSubsequence;

/**
 * MostCompetitive means a and b differ, subsequence a has a number less than the corresponding number in b
 * in a nutshell it's the less number is more competitive 1,2,3 more competitive than 1,3,3 more competitive than 1,3,4 ...
 */

/**
 - Solution:
   if the current number is less than prev number we can replace it to generate less sequence
    e.g.: sequence = [1,2,4],  num[i] = 3 ==>>>[1,2,3]
          iff we have enough numbers in nums to generate sequence of length k
 */
public class Solution2 {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] res = new int[k];
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            while(j > 0 && nums[i] < res[j-1] && j + nums.length - i > k) {
                j--;
            }

            if(j < k)
                res[j++] = nums[i];
        }
        return res;
    }
}
