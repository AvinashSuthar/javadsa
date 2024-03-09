package com.DSA;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sqrt(n));
    }
    static double sqrt(int n){
        int p = 5;
        int start =0;
        int end = n;
        int mid = 0;
        if (n<2){
            return n;
        }

        while (start<=end){
             mid = start + (end-start)/2;

            if (mid * mid == n){
                return mid;
            }
            if (mid * mid < n){
                start = mid+1;
            }
            if (mid * mid > n){
                end = mid -1;
            }

        }
        mid -= 1;
        System.out.println(mid);
        float root = (float) (mid);
        System.out.println(root);
        float increment = 0.1f;
        for (int i = 0; i < p; i++) {

            while (root * root <= n){
                root += increment;
            }
            root-= increment;
            increment /= 10;
        }
        return root;
    }

}
