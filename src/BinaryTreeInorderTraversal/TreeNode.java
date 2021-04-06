package BinaryTreeInorderTraversal;

public class TreeNode {
    int val;
    BinaryTreeInorderTraversal.TreeNode left;
    BinaryTreeInorderTraversal.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, BinaryTreeInorderTraversal.TreeNode left, BinaryTreeInorderTraversal.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
