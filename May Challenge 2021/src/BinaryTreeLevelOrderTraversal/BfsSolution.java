package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsSolution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for(int i=q.size(); i>0; i--) {
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            res.add(list);
        }
        return res;
    }
}
