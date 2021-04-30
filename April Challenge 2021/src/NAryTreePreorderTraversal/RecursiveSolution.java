package NAryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(Node root, List<Integer> res) {
        if(root == null) return;
        res.add(root.val);
        for(Node node: root.children) {
            preorder(node, res);
        }
    }
}
