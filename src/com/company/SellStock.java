package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/17/2023, Friday
 **/
public class SellStock {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0) return 0;
        int max = 0;
        int currentPrice = prices[0];
        for(int i=1;i<len;i++)
        {
            if(prices[i] > currentPrice)
            {
                max = Math.max(max,prices[i] - currentPrice);
            }
            else currentPrice = prices[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {2,4,1};
        SellStock S = new SellStock();
        System.out.println(S.maxProfit(prices));
    }
}
