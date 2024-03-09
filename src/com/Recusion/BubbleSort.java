package com.Recusion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        SelectionSort sc = new SelectionSort();
        int[] arr = {4,3,2,1};
//        System.out.println(Arrays.toString(bubblesort(arr,arr.length, 0)));
        System.out.println(Arrays.toString(SelectionSort.selectionsort(arr,arr.length, 0, 0)));
    }
    public static int[] bubblesort(int[] arr, int length, int compare){
        if (length==1){
            return arr;
        }
        if (compare<length-1){
            int a = arr[compare];
            int b =arr[compare+1];
            if (a > b){
                int temp = arr[compare];
                arr[compare] = arr[compare+1];
                arr[compare+1] =temp;
            }
            return bubblesort(arr, length, compare+1);
        }
        else {
           return bubblesort(arr, length-1, compare=0);
        }
    }
    public static void swap(int a, int b){
        if (a > b){
            int temp = a;
            a = b;
            b =temp;
        }
    }
}
