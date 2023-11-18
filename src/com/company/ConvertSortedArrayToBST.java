package com.company;

import com.sun.org.apache.xerces.internal.dom.DeferredNode;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return buildBST(nums,0,nums.length-1);

    }

    private TreeNode buildBST(int[] nums, int start, int end)
    {
        if(start == end)  return new TreeNode(nums[start],null,null);
        if(start == end -1)
        {
            TreeNode tn1 = new TreeNode(nums[start],null,null);
            TreeNode tn2 = new TreeNode(nums[end],tn1,null);
            return tn2;
        }
        int mid = (start + end)/2;
        TreeNode tnLeft = buildBST(nums,start,mid-1);
        TreeNode tnRight = buildBST(nums,mid+1,end);
        TreeNode tnMid = new TreeNode(nums[mid],tnLeft,tnRight);
        return tnMid;
    }
}
