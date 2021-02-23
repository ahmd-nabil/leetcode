package LongestWordInDictionaryThroughDelete;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PQSolution {
    public String findLongestWord(String s, List<String> d) {
        PriorityQueue<String> pq = new PriorityQueue<>(new MyComparator());
        for(String s2: d) {
            int i = 0;
            for(char c: s.toCharArray()) {
                if(i < s2.length() && c == s2.charAt(i))
                    i++;
            }

            if(i == s2.length())
                pq.add(s2);
        }
        return pq.size() == 0 ? "" : pq.poll();
    }

    class MyComparator implements Comparator<String> {
        public int compare(String a, String b) {
            if(a.length() != b.length())
                return Integer.compare(b.length(), a.length());
            return a.compareTo(b);
        }
    }
}
