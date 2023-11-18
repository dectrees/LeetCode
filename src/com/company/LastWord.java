package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class LastWord {
    public int lengthOfLastWord(String s) {
        String[] strArray = s.split("\\s+");
        return strArray[strArray.length-1].length();
    }

    public static void main(String[] args) {
        String s ="luffy is still joyboy";
        LastWord L = new LastWord();
        System.out.println(L.lengthOfLastWord(s));
    }
}
