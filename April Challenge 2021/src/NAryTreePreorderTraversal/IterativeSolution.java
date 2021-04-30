package NAryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeSolution {
    public List<Integer> preorder(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);
            for(int i = node.children.size() - 1 ; i >= 0 ; i--) {
                stack.push(node.children.get(i));
            }
        }
        return res;
    }
}
