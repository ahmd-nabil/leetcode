package BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        util(root, 0, res);
        return res;
    }

    private void util(TreeNode node, int lvl, List<Integer> res) {
        if(node == null)
            return;

        if(res.size() == lvl)
            res.add(node.val);

        util(node.right, lvl + 1, res);
        util(node.left, lvl + 1, res);
    }
}
