package AddTwoNumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int r = 0;
        ListNode preHead = new ListNode();
        ListNode l = preHead;
        while(l1 != null || l2 != null) {
            int sum = r;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            r = sum / 10;
            sum = sum % 10;

            l.next = new ListNode(sum);
            l = l.next;
        }

        if(r != 0)
            l.next = new ListNode(r);
        return preHead.next;
    }
/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

    class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {this.val = val;}
        public ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
}
