package PartitionList;

public class LeftAndRightHeaders {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode l = left, r = right;

        while(head != null) {
            if(head.val < x) {
                l.next = new ListNode(head.val);
                l = l.next;
            } else {
                r.next = new ListNode(head.val);
                r = r.next;
            }
            head = head.next;
        }
        l.next = right.next;
        return left.next;
    }
}
