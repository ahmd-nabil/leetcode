package AverageOfLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(root != null && !q.isEmpty()){
            int sz = q.size();
            double sum = 0;
            for(int i=0; i<sz; i++){
                root = q.poll();
                sum+=root.val;
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
            res.add(sum / sz);
        }
        return res;
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
