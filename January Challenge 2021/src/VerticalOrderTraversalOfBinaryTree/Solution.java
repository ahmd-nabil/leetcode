package VerticalOrderTraversalOfBinaryTree;

import java.util.*;

/**
 * Main ideas is
 * 1- Using TreeMap to Keep track of current vertical level (left is the least)
 *          maps vLevel: nodes' values in that level
 *
 * 2- Using PriorityQueues for each level to sort values by height, if same height, sort by value
 */
public class Solution {
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Queue<int[]>> map = new TreeMap<>(); // maps level : List(nodeValues)
        util(root, 0,0, map);
        List<List<Integer>> res = new ArrayList<>();

        for(int key: map.keySet()) {
            Queue<int[]> q = map.get(key);
            res.add(new ArrayList<>());
            while(!q.isEmpty())
                res.get(res.size()-1).add(q.poll()[0]);
        }
        return res;
    }

    // node-left-right (inorder traverse)
    public static void util(TreeNode node,int height, int level, Map<Integer, Queue<int[]>> map) {
        map.putIfAbsent(level, new PriorityQueue<>((a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]));
        map.get(level).add(new int[]{node.val, height});
        if(node.left != null) util(node.left, height+1, level - 1, map);
        if(node.right != null) util(node.right,height+1, level + 1, map);
    }

    public static class TreeNode {
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
