package DeepestLeavesSum;

public class RecursiveSolution {
    private int sum = 0;
    private int maxH = 0;

    public int deepestLeavesSum(TreeNode root) {
        util(root, 0);
        return sum;
    }

    private void util(TreeNode node, int h) {
        if(h == maxH) {
            sum += node.val;
        }

        if(h > maxH) {
            sum = node.val;
            maxH = h;
        }

        if(node.left != null) util(node.left, h+1);
        if(node.right != null) util(node.right, h+1);
    }
}
