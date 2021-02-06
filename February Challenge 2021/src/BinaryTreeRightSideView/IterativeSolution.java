package BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IterativeSolution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            res.add(q.peek().val);
            while(size-- != 0) {
                TreeNode node = q.poll();
                if(node.right != null) q.add(node.right);
                if(node.left != null) q.add(node.left);
            }
        }
        return res;
    }
}
