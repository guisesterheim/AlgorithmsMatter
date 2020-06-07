package com.algorithms;

public class InvertBinaryTree {

    public void invertAndPrint(){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Invert Binary Tree ---------------------");
        System.out.println("#######################################################################");

        TreeNode origin9 = new TreeNode(9);
        TreeNode origin6 = new TreeNode(6);
        TreeNode origin7 = new TreeNode(7, origin6, origin9);

        TreeNode origin3 = new TreeNode(3);
        TreeNode origin1 = new TreeNode(1);
        TreeNode origin2 = new TreeNode(2, origin1, origin3);

        TreeNode origin = new TreeNode(4, origin2, origin7);

        TreeNode inverted = invertTree(origin);

        printTreeNode(inverted);
    }

    private void printTreeNode(TreeNode temp){
        System.out.print(temp.val +", ");

        if(temp.left != null)
            printTreeNode(temp.left);

        if(temp.right != null)
            printTreeNode(temp.right);
    }

    private TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        if(root.left != null || root.right != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }

        if(root.right != null)
            root.right = invertTree(root.right);
        if(root.left != null)
            root.left = invertTree(root.left);
        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
