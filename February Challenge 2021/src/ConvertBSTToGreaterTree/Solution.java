package ConvertBSTToGreaterTree;

public class Solution {
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        util(root);
        return root;
    }

    private void util(TreeNode root) {
        if(root == null) return;
        util(root.right);
        sum += root.val;
        root.val = sum;
        util(root.left);
    }

    public class TreeNode {
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
