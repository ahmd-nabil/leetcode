package DistributeCandies;

import java.util.HashSet;
import java.util.Set;

public class HashMapSolution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> types = new HashSet<>();
        for(int i=0; i<n; i++) {
            types.add(candyType[i]);
        }
        return Math.min(types.size(), n / 2);
    }
}
