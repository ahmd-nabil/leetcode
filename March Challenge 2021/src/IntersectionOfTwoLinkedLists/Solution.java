package IntersectionOfTwoLinkedLists;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        int a = getLength(headA);
        int b = getLength(headB);
        while(a > b) {
            headA = headA.next;
            a--;
        }
        while(b > a) {
            headB = headB.next;
            b--;
        }

        while(a > 0) {
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
            a--;
        }
        return null;
    }

    private int getLength(ListNode l) {
        int size = 0;
        while(l != null) {
            size++;
            l = l.next;
        }
        return size;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
