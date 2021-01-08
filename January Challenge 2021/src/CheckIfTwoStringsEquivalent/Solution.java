package CheckIfTwoStringsEquivalent;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String w: word1)
            sb1.append(w);
        for(String w: word2)
            sb2.append(w);

        return sb1.toString().equals(sb2.toString());
    }
}

/*
Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
*/
