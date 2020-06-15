package com.algorithms;

public class SearchInABinarySearchTree {

    public void findAndPrint(){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------- Result of Search in a Binary Search Tree ---------------");
        System.out.println("#######################################################################");

        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node1, node3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4, node2, node7);

        TreeNode foundNode = searchBST(node4, 2);
        System.out.println("Found node: "+foundNode.val);
    }

    private TreeNode searchBST(TreeNode root, int val) {
        if(root == null || val < 0)
            return null;

        if(root.val == val)
            return root;

        TreeNode left = searchBST(root.left, val);
        if(left != null)
            return left;

        TreeNode right = searchBST(root.right, val);
        if(right != null)
            return right;

        return null;
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