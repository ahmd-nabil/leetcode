package ScoreOfParentheses;

import java.util.Stack;

public class StackSolution {
    public int scoreOfParentheses(String S) {
        Stack<int[]> stack = new Stack<>();
        int ans = 0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                stack.push(new int[] {i, ans});
            } else {
                int[] a = stack.pop();
                if(i - 1 == a[0]) ans += 1;
                else ans += (ans - a[1]);
            }
        }
        return ans;
    }
}
