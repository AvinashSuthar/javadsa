package com.DSA;

public class Leetcode509 {
    public static void main(String[] args) {
        System.out.println(fib2(5));
    }
    public static int fib(int n) {
        return (int) (Math.pow( ((1+ Math.sqrt(5)) / 2)  ,n )/ Math.sqrt(5)) ;
    }
    public static int fib2(int n) {
//        return (int) (Math.pow( ((1+ Math.sqrt(5)) / 2)  ,n )/ Math.sqrt(5)) ;
        if (n<2){
            return n;
        }
        int fir = 0;
        int  sec = 1;
        int cur = 0;
        for (int i = 1; i < n; i++) {
            cur  = fir + sec;
            fir = sec;
            sec = cur;
        }
        return cur;


    }
}
