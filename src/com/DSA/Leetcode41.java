package com.DSA;

import java.util.Arrays;

public class Leetcode41 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct ] && arr[i] > 0 && arr[i] <=arr.length){
                swap(arr , i , correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != j+1){
                return j +1 ;
            }
        }
        return arr.length+1;
    }

    static void cyclicSort2(int[] arr){

    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
