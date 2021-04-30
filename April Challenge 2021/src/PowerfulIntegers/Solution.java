package PowerfulIntegers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int a = x == 1? 0 : (int)(Math.log10(bound) / Math.log10(x));
        int b = y == 1? 0 : (int)(Math.log10(bound) / Math.log10(y));
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i <= a ; i++) {
            for(int j = 0 ; j <= b ; j++) {
                int sum = (int) Math.pow(x, i) + (int) Math.pow(y, j);
                if(sum <= bound)
                    set.add(sum);
                else
                    break;
            }
        }
        return new ArrayList<>(set);
    }
}
