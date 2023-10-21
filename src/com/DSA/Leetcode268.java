package com.DSA;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));

    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i<nums.length){

            if (nums[i]<nums.length && nums[i] != nums[nums[i]]){
                swap(nums, i , nums[i]);
            }
            else {
                i++;
            }

        }

        System.out.println(Arrays.toString(nums));

        int ans = 0;
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != j){
                ans = j;
                break;
            }
            else {
                ans = nums.length;
            }
        }


        return ans;
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
