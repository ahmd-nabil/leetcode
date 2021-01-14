package MoveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0)
                nums[j++] = nums[i];
        }

        while(j < nums.length)
            nums[j++] = 0;
    }

    /** My old solution :D :D pretty bad
     for (int i=0; i<nums.length; i++) {
         if (nums[i] == 0)
             for (int j = i+1 ; j < nums.length ; j++)
                 if (nums[j] != 0){
                     nums[i] ^= nums[j];
                     nums[j] ^= nums[i];
                     nums[i] ^= nums[j];
                     break;
                 }
             }

     */
}
