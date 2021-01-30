package VerticalOrderTraversalOfBinaryTree;

import java.util.List;

import static VerticalOrderTraversalOfBinaryTree.Solution.verticalTraversal;

public class Main {
    // Just for debugging purposes
    public static void main(String[] args) {
        Solution.TreeNode four = new Solution.TreeNode(4);
        Solution.TreeNode six = new Solution.TreeNode(6);
        Solution.TreeNode five = new Solution.TreeNode(5);
        Solution.TreeNode seven = new Solution.TreeNode(7);

        Solution.TreeNode two = new Solution.TreeNode(2, four, six);
        Solution.TreeNode three = new Solution.TreeNode(3, five, seven);

        Solution.TreeNode root = new Solution.TreeNode(1, two, three);

        List<List<Integer>> res = verticalTraversal(root);
    }
}
