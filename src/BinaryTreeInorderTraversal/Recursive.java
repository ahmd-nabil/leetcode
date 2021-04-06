package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Recursive {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        util(res, root);
        return res;
    }

    private void util(List<Integer> res, TreeNode root) {
        if(root == null) return;
        util(res, root.left);
        res.add(root.val);
        util(res, root.right);
    }
}

