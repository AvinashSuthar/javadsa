package com.Recusion;

public class CheckArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6};
        System.out.println(sorted(arr,0));
    }

    public static boolean sorted(int[] arr , int index){
        if (arr.length-(index+1) <= 0){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;
        }
        else {
            return sorted(arr, index+1);
        }
//        return sorted(arr , index+1);
    }
}
