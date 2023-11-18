package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p.val != q.val) return false;
        else
        {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }

    public boolean isSammetricTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p.val != q.val) return false;
        else
        {
            return isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
        }
    }
}
