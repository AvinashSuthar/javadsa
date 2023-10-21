package com.DSA;

import java.util.Arrays;

public class Leetcode287 {
        public static void main(String[] args) {
                int[] arr= {1,3,4,4,2};
                System.out.println(findDuplicate(arr));
        }
        public static int findDuplicate(int[] nums) {
                cyclicSort2(nums);
                System.out.println(Arrays.toString(nums));

                int ans = nums[nums.length-1];

            return ans;
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
