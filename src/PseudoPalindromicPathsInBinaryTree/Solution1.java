package PseudoPalindromicPathsInBinaryTree;

public class Solution1 {
    int palindromes = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root, new int[10]);
        return palindromes;
    }

    private void dfs(TreeNode root, int[] freq) {
        if(root == null) return;
        freq[root.val]++;
        if(root.left == null && root.right == null) check(freq);
        dfs(root.left, freq);
        dfs(root.right, freq);
        freq[root.val]--;
    }

    private void check(int[] freq) {
        int odds = 0;
        for(int i: freq) {
            odds += (i&1);
            if(odds > 1) return;
        }
        palindromes++;
    }
}


class TreeNode {
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