package com.company;

import javax.security.auth.kerberos.KerberosKey;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class AddBinary {
    public String addBinary(String a, String b) {
        boolean carry = false;
        char zero = '0';
        char one = '1';
        int aLen = a.length();
        int bLen = b.length();
        int len = Math.max(aLen, bLen);
        char[] result = new char[len];
        int end = -1;
        int rest = 0;
        for(int al=aLen-1, bl=bLen-1;al>=0 && bl>=0;al--,bl--)
        {
            if(al == 0) {end = 0;rest = bl;}
            if(bl == 0 ) {end = 1;rest = al;}
            char cha = a.charAt(al);
            char chb = b.charAt(bl);
            if(!carry)
            {
                if(cha == zero && chb == zero)  result[--len] = zero;
                else if(cha == zero && chb == one)  result[--len] = one;
                else if(cha == one && chb == zero)  result[--len] = one;
                else if(cha == one && chb == one) { result[--len] = zero; carry = true;}
            }
            else
            {
                if(cha == zero && chb == zero)  { result[--len] = one;carry = false;}
                else if(cha == zero && chb == one)  result[--len] = zero;
                else if(cha == one && chb == zero)  result[--len] = zero;
                else if(cha == one && chb == one)   result[--len] = one;
            }
        }
        if(rest >0) {

            for (int k = rest - 1; k >= 0; k--) {
                char cha = zero;
                if(end == 1) cha = a.charAt(k);
                if (end == 0) cha = b.charAt(k);
                if (!carry) {
                    if (cha == zero) result[k] = zero;
                    else result[k] = one;
                } else {
                    if (cha == zero) {
                        result[k] = one;
                        carry = false;
                    } else result[k] = zero;
                }
            }
        }

        String res = new String(result);
        if(!carry)
        {
            return res;
        }
        else
        {
            return "1"+res;
        }

    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        AddBinary A = new AddBinary();
        System.out.println(A.addBinary(a,b));
    }
}
