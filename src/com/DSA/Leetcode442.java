package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        cyclicSort2(nums);

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
    static void cyclicSort2(int[] arr){
        int i = 0;
        while (i<arr.length){
            if (arr[i] != arr[arr[i]-1]){
                swap(arr , i , arr[i]-1);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
