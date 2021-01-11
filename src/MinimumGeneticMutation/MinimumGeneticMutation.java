package MinimumGeneticMutation;

import java.util.*;

public class MinimumGeneticMutation {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> set = new HashSet<>(Arrays.asList(bank));
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        int level = -1;
        while(!queue.isEmpty()) {
            level++;
            int size = queue.size();
            while(size-- != 0) {
                char[] chars = queue.poll().toCharArray();
                List<String> neighbors = getNeighbors(chars, set);
                for(String s: neighbors) {
                    if(s.equals(end)) return level+1;
                    queue.add(s);
                }
            }
        }
        return -1;
    }

    private List<String> getNeighbors(char[] chars, Set<String> set) { // O(M^2)
        char[] rep = {'A', 'C', 'G', 'T'};
        List<String> neighbors = new ArrayList<>();
        for(int i=0; i<chars.length; i++) { // O(M)
            for(char c: rep) {
                char temp = chars[i];
                chars[i] = c;
                String current = new String(chars); // O(M)
                if(set.contains(current)) {
                    neighbors.add(current);
                    set.remove(current);
                }
                chars[i] = temp;
            }
        }
        return neighbors;
    }
}

/**

 Example 2:
 start: "AACCGGTT"
 end:   "AAACGGTA"
 bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]
 return: 2
 */