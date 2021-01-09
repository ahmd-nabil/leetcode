package WordLadder;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        int level = 0;
        Queue<String> q = new LinkedList<>();
        set.remove(beginWord);
        q.add(beginWord);

        while(!q.isEmpty()) {
            int size = q.size();
            level++;
            for(int i=0; i<size; i++) {
                String currentWord = q.poll();
                if(currentWord.equals(endWord)) return level;
                List<String> neighbors = getNeighbors(currentWord);
                for(String neigh: neighbors) {
                    if(set.contains(neigh)) {
                        set.remove(neigh);
                        q.add(neigh);
                    }
                }
            }
        }
        return 0;
    }

    public List<String> getNeighbors(String currentWord) {
        char[] chars = currentWord.toCharArray();
        List<String> result = new ArrayList<>();
        for(int i=0; i<chars.length; i++) { // O(M)
            char temp = chars[i];
            for(char c='a'; c<='z'; c++) {  // O(26)
                chars[i] = c;
                result.add(new String(chars)); // O(M)
            }
            chars[i] = temp;
        }
        return result;
    }
}
