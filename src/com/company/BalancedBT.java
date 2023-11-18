package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class BalancedBT {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftDepth =  depth(root.left);
        int rightDepth  = depth(root.right);
        int abs = Math.abs(rightDepth - leftDepth);
        if(isBalanced(root.left) && isBalanced(root.right) && abs<=1) return true;
        return false;
    }

    private int depth(TreeNode root)
    {
        if(root == null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
