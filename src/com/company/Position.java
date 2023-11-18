package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class Position {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] >= target) return i;
        }
        return nums.length;
    }
}
