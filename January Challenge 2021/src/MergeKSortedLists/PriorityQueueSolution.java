package MergeKSortedLists;

import java.util.PriorityQueue;

public class PriorityQueueSolution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b)->a.val - b.val);

        for(ListNode node: lists) {
            if(node != null)
                pq.add(node);
        }

        ListNode preHead = new ListNode(-1);
        ListNode cur = preHead;

        while(!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            cur.next = minNode;
            cur = cur.next;
            if(minNode.next != null)
                pq.add(minNode.next);
        }
        return preHead.next;
    }

    // Definition of singly-linked list
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
