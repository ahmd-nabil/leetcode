package EvaluateReversePolishNotation;

import java.util.Stack;

public class StackSolution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(token.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if(token.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if(token.equals("-")) {
                int second = stack.pop(), first = stack.pop();
                stack.push(first - second);
            }
            else if(token.equals("/")) {
                int second = stack.pop(), first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
