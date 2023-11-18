package com.company;

import java.util.Arrays;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmpArr = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(nums1[i] <= nums2[j]) tmpArr[k++] = nums1[i++];
            else tmpArr[k++] = nums2[j++];
        }
        while(i<m) tmpArr[k++] = nums1[i++];
        while(j<n) tmpArr[k++] = nums2[j++];
        for(int w=0;w<m+n;w++) nums1[w] = tmpArr[w];
    }

    public static void main(String[] args) {
        int[] nums1 = {0};//3
        int[] nums2 = {1};//3
        MergeArray M = new MergeArray();
        M.merge(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
}
