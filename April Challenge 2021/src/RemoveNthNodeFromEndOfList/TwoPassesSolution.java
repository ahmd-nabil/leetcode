package RemoveNthNodeFromEndOfList;

public class TwoPassesSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);   // used to prevent edge cases for head
        dummy.next = head;
        ListNode cur = dummy;
        int sz = 0;
        while(cur.next != null) {
            sz++;
            cur = cur.next;
        }
        int steps = sz - n;
        cur = dummy;
        while(steps-- > 0) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}
