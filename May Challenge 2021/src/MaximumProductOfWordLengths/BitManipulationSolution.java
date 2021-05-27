package MaximumProductOfWordLengths;

public class BitManipulationSolution {
    public int maxProduct(String[] words) {
        if(words == null || words.length == 0) return 0;

        int[] value = new int[words.length];
        for(int i=0; i<words.length; i++) {
            for(char c: words[i].toCharArray())
                value[i] |= 1 << c - 'a';
        }

        int res = 0;
        for(int i=0; i<value.length; i++) {
            for(int j=i+1; j<value.length; j++) {
                if((value[i] & value[j]) == 0 )
                    res = Math.max(res, words[i].length() * words[j].length());
            }
        }
        return res;
    }
}
