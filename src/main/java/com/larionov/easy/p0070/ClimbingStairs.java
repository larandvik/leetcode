package com.larionov.easy.p0070;

import java.util.Arrays;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:
1 <= n <= 45
*/
public class ClimbingStairs {

    public static int memorization(int n, int[] dp) {
        if (n == 0 || n == 1) return 1;

        if (dp[n] != -1) return dp[n];
        int oneStep = memorization(n - 1, dp);
        int twoStep = memorization(n - 2, dp);
        return dp[n] = oneStep + twoStep;
    }

    public static int helperFunction(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return memorization(n, dp);
    }

    public static int climbStairs(int n) {
        return helperFunction(n);

//        or fast and easy:
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//
//        int prev1 = 1;
//        int prev2 = 2;
//        int result = 0;
//
//        for (int i = 3; i <= n; i++) {
//            result = prev1 + prev2;
//            prev1 = prev2;
//            prev2 = result;
//        }
//        return result;
    }

}
