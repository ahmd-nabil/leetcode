package SwappingNodesInLinkedList;

public class TwoPointersSolution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head, first = head, second = head;

        for(int i=1; i<k; i++) {
            fast = fast.next;
        }
        first = fast;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        second = slow;

        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
