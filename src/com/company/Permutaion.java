package com.company;

import sun.security.util.ArrayUtil;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/15/2023, Wednesday
 **/
public class Permutaion {

    private int findNext(List<Integer> list, int num,int index)
    {
        if(list.isEmpty()) return -1;
        Set<Integer> set = new HashSet(list);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int value = it.next();
            if(value <= num) it.remove();
        }
        if(set.isEmpty()) return -1;

        while(!set.isEmpty())
        {
            int min = Collections.min(set);
            int idx = list.lastIndexOf(min);
            if(idx <index) set.remove(min);
            else return idx;
        }

        return -1;
    }
    public void nextPermutation(int[] nums) {
        List<Integer> listNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int len = nums.length;
        int next =-1;
        for(int i=len-2;i>=0;i--)
        {
            next = findNext(listNums,nums[i],i);
//            System.out.println("find next:"+arr[next]);
            if(next != -1)
            {
                    int t = nums[i];
                    nums[i] = nums[next];
                    nums[next] = t;
                    Arrays.sort(nums,i+1,nums.length);
                    break;
            }
        }
        if(next == -1) Arrays.sort(nums);
    }

    public static void main(String[] args) {
        Permutaion p = new Permutaion();
        int[] nums = {1,3,5,6,4,2};
//        System.out.println(Arrays.toString(nums));
//        p.nextPermutation(nums);
//        System.out.println(Arrays.toString(nums));
        int index = Arrays.binarySearch(nums,2);
        System.out.println(index);
    }
}
