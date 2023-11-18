package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/

class TreeNode {
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

public class TreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        if (root.left != null) list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        if (root.right != null) list.addAll(inorderTraversal(root.right));
        return list;
    }
}
