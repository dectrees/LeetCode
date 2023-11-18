package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class MinimumDepth {
    public int minDepth(TreeNode root) {
        if(root == null ) return 0;
        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);

        if(minLeft == 0 && minRight != 0) return minRight+1;
        if(minLeft !=0 && minRight == 0) return minLeft+1;
        return Math.min(minLeft,minRight)+1;
    }
}
