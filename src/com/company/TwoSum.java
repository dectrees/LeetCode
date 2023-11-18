package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 10/14/2023, Saturday
 **/
public class TwoSum {
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        int length = nums.length;
//        for(int i=0;i<length-1;i++)
//        {
//            for(int j = i+1;j<length;j++)
//            {
//                if(nums[i]+nums[j] == target)
//                {
//                    res[0] = i;
//                    res[0] = j;
//                    return res;
//                }
//            }
//        }
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap();


        Arrays.stream(nums).forEach(n->map.put(map.size(),n));

        System.out.println(map);
        Arrays.stream(nums).forEach(n-> System.out.print(n+" "));
        System.out.println();
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(n-> System.out.print(n+" "));
        System.out.println();
        int ts = 0;
        for(int i=0;i<length-1;i++)
        {
            for(int j = i+1;j<length;j++)
            {
                ts = nums[i]+nums[j];
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                if(ts == target)
                {

                    res = map.entrySet().stream().filter(item->list.contains(item.getValue())).map(item->item.getKey()).mapToInt(Integer::intValue).toArray();
//                    Arrays.stream(res).forEach(n-> System.out.print(n+"-"));
//                    System.out.println();
                    if(res[0] > res[1])
                    {
                        int temp = res[0];
                        res[0] = res[1];
                        res[1] = temp;
                    }
                    return res;
                }
                else if(ts> target) break;
            }
        }


        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,3};
        TwoSum m = new TwoSum();
        int[] res = m.twoSum(arr,6);
        if(res.length == 2) System.out.println(res[0]+"*"+res[1]);
    }
}
