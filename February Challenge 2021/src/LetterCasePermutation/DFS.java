package LetterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        util(s.toCharArray(), res, 0);
        return res;
    }

    private void util(char[] chars, List<String> res, int i) {
        if(i == chars.length) {
            res.add(new String(chars));
            return;
        }

        if(chars[i] >= '0' && chars[i] <= '9') {
            util(chars, res, i+1);
            return;
        }

        chars[i] = Character.toLowerCase(chars[i]);
        util(chars, res, i+1);

        chars[i] = Character.toUpperCase(chars[i]);
        util(chars, res, i+1);
    }
}
