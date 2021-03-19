package KeysAndRooms;

import java.util.*;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.add(0);
        set.add(0);

        while(queue.size() > 0) {
            List<Integer> nextRoom = rooms.get(queue.poll());
            for(int key: nextRoom) {
                if(set.contains(key)) continue;
                queue.add(key);
                set.add(key);
            }
        }
        return set.size() == n;
    }
}
