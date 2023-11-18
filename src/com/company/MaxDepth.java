package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class MaxDepth {

    public List<Integer> inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root== null) return list;
        TreeNode tn = root;

        while(tn !=null || !stack.isEmpty())
        {
            while(tn!= null)
            {
                stack.push(tn);
                tn = tn.left;
            }
            if(!stack.isEmpty())
            {
                tn = stack.pop();
                list.add(tn.val );
                tn = tn.right;
            }
        }
        return list;
    }

    public List<Integer> preorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root== null) return list;
        TreeNode tn = root;
        while(tn!=null ||!stack.isEmpty())
        {
            while(tn!=null)
            {
                stack.push(tn);
                list.add(tn.val );
                tn = tn.left;
            }
            if(!stack.isEmpty())
            {
                tn = stack.pop();
                tn = tn.right;
            }
        }
        return list;
    }

    public List<Integer> postorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeNode tn = root,pre = null;
        while (tn != null || !stack.isEmpty()) {
            while(tn!=null)
            {
                stack.push(tn);
                tn = tn.left;
            }
            if(!stack.isEmpty())
            {
                tn = stack.peek();
                if(tn.right == null || tn.right == pre)
                {
                    tn  = stack.pop();
                    list.add(tn.val );
                    pre = tn;
                    tn = null;
                }
                else tn = tn.right;
            }
        }
        return list;
    }

    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return 0;
        TreeNode tn = root,pre = null;
        int max = 0;
        while (tn != null || !stack.isEmpty()) {
            while(tn!=null)
            {
                stack.push(tn);
                max = Math.max(max,stack.size());
                tn = tn.left;
            }
            if(!stack.isEmpty())
            {
                tn = stack.peek();
                if(tn.right == null || tn.right == pre)
                {
                    tn  = stack.pop();
                    pre = tn;
                    tn = null;
                }
                else tn = tn.right;
            }
        }
        return max;
    }
}