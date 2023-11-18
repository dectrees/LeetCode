package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listRes = new ArrayList<>();
        List<Integer> listPre = null;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        listRes.add(list);
        if(numRows == 1) return listRes;

        for(int i=1;i<numRows;i++)
        {
            List<Integer> listTmp = new ArrayList<>();
            listTmp.add(1);
            for(int j=1;j<i;j++)
            {
                listTmp.add(listPre.get(j-1)+listPre.get(j));
            }
            listTmp.add(1);
            listPre = listTmp;
            listRes.add(listTmp);
        }
        return listRes;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> listPre = null;
        List<Integer> listTmp = null;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if(rowIndex == 0) return list;
        for(int i=1;i<=rowIndex;i++)
        {
            listTmp = new ArrayList<>();
            listTmp.add(1);
            for(int j=1;j<i;j++)
            {
                listTmp.add(listPre.get(j-1)+listPre.get(j));
            }
            listTmp.add(1);
            listPre = listTmp;
        }
        return listPre;
    }
}
