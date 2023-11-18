package com.company;

import java.sql.SQLOutput;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/6/2023, Monday
 **/
public class Palindrome {



        public boolean isPalindrome(int x) {
            int b=0;
            int bPre=1;
            int temp = 0;
            if(x < 0) return false;
            else if(x >= 0 && x < 10) return true;
            else if (x%10 == 0) return false;
            while(x>b)
            {
                temp = x % 10;
                x = x/10;
                bPre = b;
                b = b*10 + temp;
            }
            if(x == b) return true;
            else if( x == bPre) return true;

            return false;
        }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println("result of: "+p.isPalindrome(100));
    }
}
