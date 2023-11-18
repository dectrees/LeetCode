package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Integer max = Collections.max(list);
//        System.out.println("max:"+max);
        if(max == val)
        {
            Arrays.sort(nums);
            Collections.sort(list);
            return list.indexOf(val);
        }
        else
        {
            ListIterator<Integer> it = list.listIterator();
            while(it.hasNext())
            {
                int value = it.next();
                if(value == val)
                {
                    it.set(max+10);
//                    System.out.println("set max:"+(max+10));
                }
            }
//            System.out.println("res list:"+list);
            Collections.sort(list);

            int[] res = list.stream().mapToInt(Integer::intValue).toArray();
//            System.out.println("res res:"+Arrays.toString(res));

//            System.out.println("sorted res:"+Arrays.toString(res));
            System.arraycopy(res,0,nums,0,res.length);
//            System.out.println("sorted nums:"+Arrays.toString(nums));
            int k = list.indexOf(max + 10);
            if(k<0) return nums.length;
            else return k;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2};
        System.out.println(Arrays.toString(nums));
        RemoveElement R = new RemoveElement();
        int k = R.removeElement(nums,2);
        System.out.println("k:"+k+" "+Arrays.toString(nums));
    }
}
