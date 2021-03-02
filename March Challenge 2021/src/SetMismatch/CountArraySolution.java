package SetMismatch;

public class CountArraySolution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];

        for(int x: nums)
            count[x]++;

        int[] res = new int[2];

        for(int i=1,j= 0; i<n+1 && j<2; i++) {
            if(count[i] == 2)
                res[0] = i;

            if(count[i] == 0)
                res[1] = i;
        }

        return res;
    }
}
