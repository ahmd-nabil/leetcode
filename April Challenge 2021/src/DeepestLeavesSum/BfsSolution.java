package DeepestLeavesSum;

import java.util.LinkedList;
import java.util.Queue;

public class BfsSolution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        while(!q.isEmpty()) {
            sum = 0;
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return sum;
    }
}
