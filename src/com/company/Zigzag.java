package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/15/2023, Wednesday
 **/
public class Zigzag {
    public String convert(String s, int numRows) {
        if(numRows == 1)  return s;
        //initial data structure
        Map<Integer, LinkedList<String>> map  = new TreeMap<>();
        for(int i=0;i<numRows;i++)
        {
            map.put(i,new LinkedList<String>());
        }
        //
        int length = s.length();
        int modeSpan = 0;
        int modeFull = 0;
        for(int j=0;j<length;j++)
        {
            modeFull = j%(2*numRows-2);
            modeSpan = modeFull%numRows;
            if(modeFull <numRows)
            {
                map.get(modeFull).addLast(s.charAt(j)+"");
            }
            else{
                map.get(numRows-modeSpan-2).addLast(s.charAt(j)+"");
            }
        }
        Iterator<Integer> it = map.keySet().iterator();
        String sRes = new String("");
        while(it.hasNext())
        {
            LinkedList<String> list = map.get(it.next());
            Iterator<String> its = list.iterator();
            while(its.hasNext())
            {
                sRes += its.next();
            }
        }
        System.out.println(sRes);
        return sRes;
     }

    public static void main(String[] args) {
        Zigzag z  = new Zigzag();
        z.convert("S",1);
    }
}
