package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/23/2023, Thursday
 **/
public class SortedRotateArray {

    private int binaryFind(int[] nums,int start, int end, int target)
    {
        if(start > end ) return -1;
        int mid = (start + end)/2;
        if(target == nums[mid]) return mid;
        else if(target < nums[mid] )
        {
            if(nums[start] <= nums[mid])
            {
                if(target >= nums[start])
                    return binaryFind(nums,start, mid-1,target);
                else
                    return binaryFind(nums,mid+1,end,target);
            }
            else
            {
                return binaryFind(nums,start,mid -1,target);
            }
        }
        else
        {
            if(nums[mid] < nums[end])
            {
                if(target > nums[end])
                    return binaryFind(nums,start,mid-1,target);
                else
                    return binaryFind(nums,mid+1,end,target);
            }
            else
            {
                return binaryFind(nums,mid+1,end,target);
            }
        }
    }
    public int search(int[] nums, int target) {
        int len = nums.length;
        return binaryFind(nums,0,len-1,target);
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        SortedRotateArray SR = new SortedRotateArray();
        System.out.println(SR.search(nums,1));
    }
}
