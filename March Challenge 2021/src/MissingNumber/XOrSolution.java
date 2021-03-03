package MissingNumber;

public class XOrSolution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i=0; i<nums.length; i++) {
            missing ^= i;       // ^= (0: n-1)
            missing ^= nums[i]; // ^= (0:n)
            // missing = (n ^ wantedNumber)
            // then we have to add ^n before or after the loop, to get the wanted missing number
        }
        return missing;
    }
}
