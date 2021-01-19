package LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++) {
            int len = Math.max(palindromeLength(s, i, i), palindromeLength(s, i, i+1));
            if(len > end - start +1) {
                start = i - (len - 1)/2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int palindromeLength(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        // j-i+1-2 =>> j-i+1: normal length , -2: last 2 chars didn't pass (broke the while loop)
        return j - i - 1;
    }
}
