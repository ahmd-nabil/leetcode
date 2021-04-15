package PartitionList;

import java.util.ArrayList;
import java.util.List;

public class ListSolution {
    public ListNode partition(ListNode head, int x) {
        List<Integer> list = new ArrayList<>(); // to keep the right values in original order
        ListNode node = head, place = head;
        while(node != null) {
            if(node.val < x) {
                place.val = node.val;
                place = place.next;
            } else {
                list.add(node.val);
            }
            node = node.next;
        }
        for(int i=0; i<list.size(); i++) {
            place.val = list.get(i);
            place = place.next;
        }
        return head;
    }
}
