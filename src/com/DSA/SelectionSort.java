package com.DSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 9};
//        int[] arr = {5,43,2,43,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {4, 5, 2, 7};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1 ; j < arr.length ; j++) {
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

