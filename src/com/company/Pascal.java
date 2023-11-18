package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 10/16/2023, Monday
 **/
public class Pascal {

    private Integer ValueOf(List arr, int row, int col)
    {
        if(row < 2) return 1;
        if(col == 0 || col == row) return 1;
        return ValueOf(arr,row-1,col-1)+ValueOf(arr,row-1,col);
    }

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(rowIndex+1,1));
        arr.set(0,1);
        arr.set(rowIndex,1);
        for(int j = 1; j<rowIndex;j++)
        {
            arr.set(j,ValueOf(arr,rowIndex-1,j-1) + ValueOf(arr,rowIndex-1,j));
        }
        return arr;
    }
    public static void main(String[] args) {
        Pascal p = new Pascal();
        List<Integer> list = p.getRow(4);
        System.out.println(list);
    }
}
