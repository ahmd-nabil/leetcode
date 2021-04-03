package LongestValidParentheses;

import java.util.Stack;

public class BruteForce {
    static class Solution {
        public int longestValidParentheses(String s) {
            int res = 0;
            for(int i=0; i<s.length(); i++) {
                for(int j = s.length(); j>i; j--) {
                    if(isValid(s.substring(i,j))) {
                        res = Math.max(res, j - i);
                    }
                }
            }
            return res;
        }

        private boolean isValid(String s) {
            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    if(stack.isEmpty())
                        return false;
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }
}
