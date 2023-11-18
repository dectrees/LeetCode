package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        String tmpPrefix = "";
        int length = strs[0].length();
        Boolean resBoolean = true;
        for(String str:strs)
        {
            if(str.length() < length)
            {
                shortest = str;
                length = str.length();
            }
        }
//        System.out.println("shortest:"+shortest);

        for(int len=length;len>0;len--)
        {
            resBoolean = true;
            tmpPrefix = shortest.substring(0,len);

//            System.out.println("try:"+tmpPrefix);
           for(String str2:strs)
            {
                String subStr2 = str2.substring(0,len);
                if(!subStr2.equals(tmpPrefix))
                {
                    resBoolean = false;
                    break;
                }
            }
           if(resBoolean) return tmpPrefix;
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        CommonPrefix C = new CommonPrefix();
        System.out.println(C.longestCommonPrefix(strs));
    }
}
