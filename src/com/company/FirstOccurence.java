package com.company;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class FirstOccurence {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String hayStack = "woasdfkalsdkfja";
        String needle ="sdkddd";
        int idx = hayStack.indexOf(needle);
        System.out.println(idx);
    }
}
