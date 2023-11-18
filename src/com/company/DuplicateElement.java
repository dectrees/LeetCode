package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class DuplicateElement {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new LinkedHashSet<>(list);
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        System.arraycopy(res,0,nums,0,res.length);
        return res.length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        DuplicateElement D = new DuplicateElement();
        int len = D.removeDuplicates(nums);
        System.out.println("len:"+len+" "+Arrays.toString(nums));
    }
}
