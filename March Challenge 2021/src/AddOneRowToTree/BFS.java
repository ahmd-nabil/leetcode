package AddOneRowToTree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        int size, lvl = 1;
        if(d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(lvl != d-1) {
            size = queue.size();
            while(size-- > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            lvl++;
        }

        size = queue.size();
        while (size-- > 0) {
            TreeNode node = queue.poll();
            TreeNode l = node.left;
            TreeNode r = node.right;

            node.left = new TreeNode(v);
            node.left.left = l;
            node.right = new TreeNode(v);
            node.right.right = r;
        }
        return root;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
