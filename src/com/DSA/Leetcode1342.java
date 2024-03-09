package com.DSA;

public class Leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return counter(num , 0);
    }
    static int counter(int n , int c){
        if (n == 0){
            return c;
        }
        if ((n%2) == 0){
            return counter(n/2 , c+1);
        }

            return counter(n-1 , c+1);

//        return c;
    }
}
