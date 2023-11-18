package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        Boolean carry = true;
        List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());
        ListIterator<Integer> it = list.listIterator(list.size());
        while(carry && it.hasPrevious())
        {
            int value = it.previous();
            value +=1;
            if(value <= 9)
            {
                carry = false;
                it.set(value);
            }
            else
            {
                it.set(0);
            }
        }
        if(carry)
        {
            it.add(1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] digits = {9};
        PlusOne P = new PlusOne();
        System.out.println(Arrays.toString(P.plusOne(digits)));
    }
}
