package com.DSA;

import java.util.Arrays;

public class Leetcode189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
    }
    public static void rotate1(int[] nums, int k) {
//         This approach is time consuming so prefer second approach its time complexity is on2
        int max = k;
        for (int i = 0; i < max; i++) {
           int temp = nums[nums.length-1];
            for (int j = nums.length-1; j > 0 ; j--) {
                nums[j]= nums[j-1];

            }
            nums[0] = temp;

//            int temp =nums[i];
//            nums[i] = nums[nums.length-k];
//            nums[nums.length-k] = temp;
//            k--;

        }
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
//         This approach is time-consuming so prefer second approach its time complexity is on2
       reverseArray(nums , 0, nums.length);
        reverseArray(nums, 0, k);
        reverseArray(nums, k, nums.length);

        System.out.println(Arrays.toString(nums));
    }
    private static void reverseArray(int[] arr, int start ,int end){
        int en = 0;
        for (int i = start; i < start+(end-start)/2; i++) {

            int temp =arr[i];
            arr[i] = arr[end - en-1];
            arr[end - en-1] = temp;
            en++;
        }
    }
}

// this is best solution beats 100% of users
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
    }
    public void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}