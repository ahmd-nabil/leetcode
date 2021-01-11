package NextGreaterElement2;

import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>(); // to keep all next bigger elements

        for(int loop=0; loop<2; loop++) {
            for(int i=nums.length-1; i>=0; i--) {
                // we are moving backwards
                // so, if current element is bigger than elements in stack then pop them
                // because they won't be reached by next elements (their bigger element will be current) "think about it"
                while(!stack.isEmpty() && nums[i] >= stack.peek()) {
                    stack.pop();
                }
                res[i] = stack.isEmpty() ? -1: stack.peek();
                stack.push(nums[i]);
            }
        }
        return res;
    }
}
