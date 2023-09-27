package com.questions;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,6,10};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];

            }
        }
        System.out.println(max);
    }

}
