package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null)
        {
            if(targetSum == root.val ) return true;
            else return false;
        }
        if(root.left != null && root.right != null)
        {
            return hasPathSum(root.left,targetSum-root.val )|| hasPathSum(root.right,targetSum-root.val );
        }
        return false;
    }
}
