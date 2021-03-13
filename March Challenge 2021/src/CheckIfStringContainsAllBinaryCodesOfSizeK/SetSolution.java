package CheckIfStringContainsAllBinaryCodesOfSizeK;

import java.util.HashSet;
import java.util.Set;

public class SetSolution {
    public boolean hasAllCodes(String s, int k) {
        int n = 1 << k;     // n = n*2 k number of times
        Set<String> set = new HashSet<>();

        for(int i=k; i<=s.length(); i++) {
            set.add(s.substring(i-k, i));
        }
        return set.size() == n;
    }
}
