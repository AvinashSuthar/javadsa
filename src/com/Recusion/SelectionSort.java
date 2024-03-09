package com.Recusion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(selectionsort(arr,arr.length, 0, 0)));
    }

    public static int[] selectionsort(int[] arr , int length, int compare,int max){
        if (length<=0){
            return arr;
        }
        if (compare<length){
            if (arr[max]<arr[compare]){
                max = compare;
            }
//            max = 0;
            return selectionsort(arr, length, compare+1, max);
        }
        else {
            int tem = arr[length-1];
            arr[length-1] = arr[max];
            arr[max] = tem;
//            max =0;
//            arr[length-1]= max;
            return selectionsort(arr, length-1, 0 , 0);

        }
    }
}
