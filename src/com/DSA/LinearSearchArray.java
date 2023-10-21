package com.DSA;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,7,4,4};
        int target = 6;
        boolean find = false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]== target) {
                find = true;
                System.out.println(i);
            }
        }
        if (find){
            System.out.println("find");
        }
    }
}