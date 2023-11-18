package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)   return true;
        if(root.left == null && root.right!= null) return false;
        if(root.left != null && root.right== null) return false;
        if(root.left == null && root.right== null) return true;
        SameTree st = new SameTree();
        return st.isSammetricTree(root.left,root.right);
    }




}
