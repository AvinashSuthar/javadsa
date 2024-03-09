package com.Recusion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,2,3};
        quick(arr , 0 ,  arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr , int low, int high){
        if(low>= high) {
            return;
        }
        int s = low;
        int e = high;
        int m  = s + (e-s)/2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;

            }
        }
        quick(arr , low, e);
        quick(arr , s , high);
    }
}
