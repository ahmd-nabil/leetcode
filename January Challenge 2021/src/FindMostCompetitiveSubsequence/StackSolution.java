package FindMostCompetitiveSubsequence;

import java.util.Stack;

public class StackSolution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<nums.length; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i] && stack.size()+nums.length-i > k) {
                stack.pop();
            }

            if(stack.size() < k)
                stack.push(i);
        }

        int[] res = new int[k];
        for(int i=k-1; i>=0; i--)
            res[i] = nums[stack.pop()];
        return res;
    }
}
