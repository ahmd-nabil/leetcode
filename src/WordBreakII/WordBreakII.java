package WordBreakII;

import java.util.*;

public class WordBreakII {
    /*TLE solution till i find better one*/
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        List<String>[] map = new ArrayList[s.length() + 1];
        for(int i=0; i<map.length; i++)
            map[i] = new ArrayList<>();

        map[0].add("");
        for(int i=1; i<=s.length(); i++) {
            for(int j=0; j<i; j++) {
                if(map[j].size() != 0 && set.contains(s.substring(j, i))) {
                    List<String> jList = map[j];
                    List<String> iList = map[i];
                    for(String js: jList)
                        iList.add((js + " " + s.substring(j, i)).trim());
                }
            }
        }
        return map[s.length()];
    }
}
/*
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.

Note:
The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.

Example 1:
Input:
s = "catsanddog"
wordDict = ["cat", "cats", "and", "sand", "dog"]
Output:
[
  "cats and dog",
  "cat sand dog"
]

Example 2:
Input:
s = "pineapplepenapple"
wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
Output:
[
  "pine apple pen apple",
  "pineapple pen apple",
  "pine applepen apple"
]
Explanation: Note that you are allowed to reuse a dictionary word.


Example 3:
Input:
s = "catsandog"
wordDict = ["cats", "dog", "sand", "and", "cat"]
Output:
[]

*/