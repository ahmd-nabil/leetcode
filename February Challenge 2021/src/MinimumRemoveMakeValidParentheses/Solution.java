package MinimumRemoveMakeValidParentheses;

/**
 * Going Left To Right: At any point open must be >= close
 * Going Right to Left: At any point close must be >= open
 * So we iterate twice forward and backward removing any parentheses that doesn't qualify
 * */
public class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] str = s.toCharArray();
        int open = 0, close = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i] == '(') {
                open++;
            } else if(str[i] == ')') {
                close++;
                if(close > open) {
                    str[i] = ' ';
                    close--;
                }
            }
        }

        open = 0;
        close = 0;
        for(int i=str.length-1; i>=0; i--) {
            if(str[i] == ')')
                close++;
            else if (str[i] == '(') {
                open++;
                if(open > close) {
                    str[i] = ' ';
                    open--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : str) {
            if(c != ' ')
                sb.append(c);
        }
        return sb.toString();
    }
}
