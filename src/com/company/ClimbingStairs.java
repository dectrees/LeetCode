package com.company;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class ClimbingStairs {
//    public int climbStairs(int n) {
//        if(n==1) return 1;
//        if(n==2) return 2;
//        return climbStairs(n-1) + climbStairs(n-2);
//    }

    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++)
        {
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        ClimbingStairs C = new ClimbingStairs();
        System.out.println(C.climbStairs(3));
    }
}
