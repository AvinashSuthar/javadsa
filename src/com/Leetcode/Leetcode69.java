package com.Leetcode;

public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(6));
    }
    public static int mySqrt(int x) {
        int s = 0;
        int e = x;
        int mid = 0;
        while (s<=e) {
            mid = s + (e - s) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid < x) {
                s = mid + 1;
            }
            if (mid * mid > x) {
                e = mid - 1;
            }
        }
        return mid-1;

    }
}
