package com.company;

import sun.security.util.AuthResources_it;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/20/2023, Monday
 **/
public class ReverseInteger {
    public int reverse(int x) {
        int mark = x<0?-1:1;
        String str = String.valueOf(x);
        char ch;
        if(mark==-1)str = str.substring(1,str.length());
        StringBuffer sb = new StringBuffer(str);
        Double result = Double.parseDouble(sb.reverse().toString());
        if(result > Integer.MAX_VALUE || result< Integer.MIN_VALUE) return 0;
        return mark*result.intValue();
    }

    public static void main(String[] args) {
        int x = -1234;
        ReverseInteger RI = new ReverseInteger();
        System.out.println(RI.reverse(x));
    }
}
