package InsertionSortList;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode preHead = new ListNode(Integer.MIN_VALUE, head);
        ListNode prev = head;
        ListNode cur = head.next;

        while(cur != null) {
            if(cur.val < prev.val) {
                prev.next = cur.next;
                ListNode b4Ins = preHead;
                while(b4Ins.next.val < cur.val)
                    b4Ins = b4Ins.next;
                cur.next = b4Ins.next;
                b4Ins.next = cur;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return preHead.next;
    }
/*
Example 1:
Input: 4->2->1->3
Output: 1->2->3->4

Example 2:
Input: -1->5->3->4->0
Output: -1->0->3->4->5
*/
    class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val, ListNode next) {this.val=val; this.next=next;}
    }
}
