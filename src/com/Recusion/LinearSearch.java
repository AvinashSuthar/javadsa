package com.Recusion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,6};
        System.out.println(linearSearch2(arr,2, 0));
    }
    public static int linearSearch(int[] arr, int target, int index){
//        int i=0;

        if (arr.length==index){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        else {
            return linearSearch(arr, target, index+1);
        }

//        return i;
    }
    public static ArrayList<Integer> linearSearch2(int[] arr, int target, int index){
//        int i=0;
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length==index){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }

          ArrayList<Integer> ans =  linearSearch2(arr, target, index+1);
        list.addAll(ans);
        return list;
//        return i;
    }
}
