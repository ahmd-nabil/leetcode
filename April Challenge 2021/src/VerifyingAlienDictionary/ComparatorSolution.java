package VerifyingAlienDictionary;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparatorSolution {
    public boolean isAlienSorted(String[] words, String order) {
        AlienComparator alienComparator = new AlienComparator(order);
        for(int i=1; i<words.length; i++) {
            if(alienComparator.compare(words[i-1], words[i]) == 1)
                return false;
        }
        return true;
    }

    class AlienComparator implements Comparator<String> {
        Map<Character, Integer> rank;
        public AlienComparator(String order) {
            rank = new HashMap<>();
            for(int i=0; i<26; i++)
                rank.put(order.charAt(i), i);
        }

        @Override
        public int compare(String s1, String s2) {
            int length = Math.min(s1.length(), s2.length());
            for(int i=0; i<length; i++) {
                if(rank.get(s1.charAt(i)) < rank.get(s2.charAt(i))) {
                    return -1;
                }

                if(rank.get(s1.charAt(i)) > rank.get(s2.charAt(i))) {
                    return 1;
                }
            }
            return Integer.compare(s1.length(), s2.length());
        }
    }
}
