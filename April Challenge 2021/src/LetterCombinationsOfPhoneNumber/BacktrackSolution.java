package LetterCombinationsOfPhoneNumber;

import java.util.*;

public class BacktrackSolution {
    Map<Character, List<Character>> phone = new HashMap<>() {{
        put('2', new ArrayList<>(Arrays.asList('a','b','c')));
        put('3', new ArrayList<>(Arrays.asList('d','e','f')));
        put('4', new ArrayList<>(Arrays.asList('g','h','i')));
        put('5', new ArrayList<>(Arrays.asList('j','k','l')));
        put('6', new ArrayList<>(Arrays.asList('m','n','o')));
        put('7', new ArrayList<>(Arrays.asList('p','q','r','s')));
        put('8', new ArrayList<>(Arrays.asList('t','u','v')));
        put('9', new ArrayList<>(Arrays.asList('w','x','y','z')));
    }};
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return res;
        backtrack(digits, new StringBuilder(), 0);
        return res;
    }

    private void backtrack(String digits, StringBuilder curr, int i) {
        if(i == digits.length()) {
            res.add(curr.toString());
            return;
        }

        for(char c : phone.get(digits.charAt(i))) {
            curr.append(c);
            backtrack(digits, curr, i+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
