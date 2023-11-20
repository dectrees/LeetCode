package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/20/2023, Monday
 **/
public class LongestPalindromic {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len == 1 ) return s;
        int start=0, end=0, max=0;
        for(int i=0;i<len-1;i++)
        {
            for(int j=len-1;j>i;j--)
            {
                if(j-i+1<=max) break;
                int mid = (i+j)/2;
                boolean find = true;
                for(int k = j,w=i;k>mid;k--,w++)
                {
                    if(s.charAt(w) != s.charAt(k)) {find = false; break;}
                }
                if(find) {
                    int tmp = j-i+1;
                    if(tmp>max) {
                        start = i;
                        end = j;
                        max = tmp;
//                        System.out.println("start,end:" + start + ":" + end);
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }

    public static void main(String[] args) {
        String s = "abcba";
        LongestPalindromic LP = new LongestPalindromic();

        System.out.println(LP.longestPalindrome(s));
    }
}
