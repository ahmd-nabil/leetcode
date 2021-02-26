package ValidateStackSequences;

import java.util.Stack;

public class StackSolution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i=0; i<pushed.length; i++) {
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
