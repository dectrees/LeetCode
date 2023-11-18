package com.company;

import static java.lang.Math.min;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/15/2023, Wednesday
 **/
public class WaterContainer {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int temp = 0;
        int minHeight = 0;
        for(int i=0;i<len;i++)
            for(int j=i+1;j<len;j++)
            {
                minHeight  = min(height[i],height[j]);
                temp = (j-i)*minHeight;
                if(temp > max) max = temp;
            }
        return max;
    }

    public static void main(String[] args) {
        WaterContainer w = new WaterContainer();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(w.maxArea(height));
    }
}
