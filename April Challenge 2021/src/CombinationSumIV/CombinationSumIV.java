package CombinationSumIV;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target+1];
        memo[0] = 1;
        for(int i = 1; i <= target; i++) {
            for(int n : nums) {
                if(i - n >= 0)
                    memo[i] += memo[i - n];
            }
        }
        return memo[target];
    }
}
