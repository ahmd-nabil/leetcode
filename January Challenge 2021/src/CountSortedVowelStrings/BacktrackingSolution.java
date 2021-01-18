package CountSortedVowelStrings;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingSolution {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    int count = 0;
    public int countVowelStrings(int n) {
        backtrack(n, new ArrayList<>(), 0);
        return count;
    }

    private void backtrack(int n, List<Character> cur, int start) {
        if(cur.size() == n) {
            count++;
            return;
        }

        for(int i=start; i<5; i++) {
            if(cur.size() != 0 && cur.get(cur.size() - 1) > vowels[i]) continue;
            cur.add(vowels[i]);
            backtrack(n, cur, start);
            cur.remove(cur.size() - 1);
        }
    }
}
