package RemoveDuplicatesFromSortedList2;

import MergeTwoSortedLists.MergeTwoSortedLists;

public class RemoveDuplicatesFromSortedList2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val=val; this.next=next;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode preHead = new ListNode(-1, head);
        ListNode pre = preHead;
        ListNode cur = head;

        while(cur != null) {
            while(cur != null && cur.next != null && cur.val == cur.next.val)// if duplicate found => cur moves
                cur = cur.next;

            if(pre.next == cur) { // cur didn't move (no duplicates)
                pre = cur;
            } else {              // cur moved (we remove the duplicate part from the list)
                pre.next = cur.next;
            }
            cur = cur.next;
        }

        return preHead.next;
    }
}

/**
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]
 * */