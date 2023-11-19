package com.company;

import sun.security.util.AuthResources_it;

import java.util.Arrays;
import java.util.Collections;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/19/2023, Sunday
 **/
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        int len = s.length();
        if(len == 1 ) return 1;
        int max = 0;
        for(int i=0,next=0;i<len;i++)
        {
            for(int j=next+1;j<len;j++)
            {
                if(!s.substring(i,j).contains(Character.toString(s.charAt(j)))) {
                    next = j;
                    int tmp = (next-i+1);
                    max = tmp > max ? tmp:max;
                    System.out.println("longest:"+s.substring(i,next+1));
                }
                else break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = " ";
        LongestSubstring L = new LongestSubstring();
        System.out.println(L.lengthOfLongestSubstring(str));
    }
}
