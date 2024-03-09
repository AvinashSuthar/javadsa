package com.DSA;

import java.util.Arrays;

public class Leetcode1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            int pos = 0;
            arr[pos] = nums[i];
            pos += 2;
            arr[i+1] = nums[n+i];
        }
//        for (int i = 0; i < nums.length/2; i+=2) {
//            for (int j = i; j < n; j++) {
//                int temp = nums[i+1];
//                nums[i+1] = nums[i];
//                nums[i] = temp;
//            }
//           nums[i] = nums[n];
//           n += 1;
//
//        }
        return arr;
    }
}
