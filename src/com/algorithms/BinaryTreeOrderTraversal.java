package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeOrderTraversal {

    public void invertAndPrint(){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------ Result of Binary Tree Level Order Traversal --------------");
        System.out.println("#######################################################################");

        /*
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node3 = new TreeNode(3, node9, node20);
         */

        //TreeNode node1 = new TreeNode(1);

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, null, node5);
        TreeNode node2 = new TreeNode(2, node4, null);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(levelOrderBottom(node1));
    }

    private List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> temp = new ArrayList<>();

        if(root == null)
            return temp;

        ArrayList<Integer> rootVal = new ArrayList<>();
        rootVal.add(root.val);
        temp.add(rootVal);

        addLeaves(root, temp);

        List<List<Integer>> ret = new ArrayList<>();
        for(int i = temp.size()-1; i >= 0; i--){
            ret.add(temp.get(i));
        }

        return ret;
    }

    private void addLeaves(TreeNode root, List<List<Integer>> rets){
        ArrayList<Integer> nodeVals = new ArrayList<>();
        if(root.left != null)
            nodeVals.add(root.left.val);
        if(root.right != null)
            nodeVals.add(root.right.val);

        if(nodeVals.size() != 0)
            rets.add(nodeVals);

        if(root.left != null && root.right != null &&
                (root.left.right == null && root.right.left == null) ||
                (root.right.left == null && root.left.right == null)) {

            nodeVals = new ArrayList<>();
            nodeVals.add(root.right.right == null ? root.right.left.val : root.right.right.val);
            nodeVals.add(root.left.right == null ? root.left.left.val : root.left.right.val);

            rets.add(nodeVals);
        }

        if(root.left != null && (root.left.left != null || root.left.right != null))
            addLeaves(root.left, rets);
        if(root.right != null && (root.right.left != null || root.right.right != null))
            addLeaves(root.right, rets);
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