package CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        // maps each node with its copy
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;

        // first: create a copy for each node (node -> copy)
        while(cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        // assign next and random pointers for each copy
        cur = head;
        while(cur != null) {
            Node copy = map.get(cur);
            copy.next = map.get(cur.next);
            copy.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
