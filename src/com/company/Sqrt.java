package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class Sqrt {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        String strData = String.valueOf(x);
        int len = strData.length();
        int half = (int) Math.ceil((double)len/2);
        int right = 1;
        for(int i=0;i<half;i++) right *=10;
        int left = right/10;
        int mid = (left+right)/2;
//        System.out.println("left-right-mid:"+left+" "+right+" "+mid);
        while(mid != left && mid != right)
        {
            double midVal = (double)mid*mid;
            if(midVal == x) return mid;
            else if(midVal > x)  right = mid;
            else left = mid;
            mid = (left+right)/2;
//            System.out.println("left-right-mid-val:"+left+" "+right+" "+mid+" "+midVal);
        }
        return mid;
    }
    public static void main(String[] args) {
        Sqrt S = new Sqrt();
        int data = 2147395599;
        int res = S.mySqrt(data);
        System.out.println(res );
    }
}
