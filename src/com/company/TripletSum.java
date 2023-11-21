package com.company;

import jdk.nashorn.internal.runtime.FindProperty;
import sun.rmi.server.InactiveGroupException;

import java.util.*;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/20/2023, Monday
 **/
public class TripletSum {
    public List<List<Integer>> threeSumSet(int[] nums) {
        List<List<Integer>>  listRet = new ArrayList<>();
        int len = nums.length;
        if(len <3 ) return listRet;
        List<Integer> lstTmp = new ArrayList<>();
        for(int i:nums) lstTmp.add(i);
        boolean find = false;
        Integer a=0,b=0;
        while(lstTmp.size()>2)
        {
            Iterator<Integer> it = lstTmp.iterator();
            int pilot = it.next();
            it.remove();
            List<Integer> list = new ArrayList<>(lstTmp);
            int lenList = list.size();
            find = false;
            for (int i = 0; i < lenList-1; i++) {
                for (int j = i+1; j < lenList; j++) {
                    if (nums[i] + nums[j] + pilot == 0) {
                        List<Integer> ltmp = new ArrayList<>();
                        a = nums[i];
                        b = nums[j];
                        ltmp.add(a);
                        ltmp.add(b);
                        ltmp.add(pilot);
                        listRet.add(ltmp);
                        find = true;
                        break;
                    }
                }
                if(find) break;
            }
            if(find)
            {
                lstTmp.remove(a);
                lstTmp.remove(b);
            }
        }
        return listRet;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listRet = new ArrayList<>();
        Set<List<Integer>>  set = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            int j=i+1;
            int k=len-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                {
                    List<Integer>  list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                    k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }
        listRet = new ArrayList<>(set);
        return listRet;
    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("alex");
        list1.add("liu");

        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("alex");
        list2.add("liu");

        System.out.println(list2.equals(list1));
    }
}
