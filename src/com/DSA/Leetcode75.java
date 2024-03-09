package com.DSA;

public class Leetcode75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int a =0, b =0, c =0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                a++;
            }if (nums[i]==1){
                b++;
            }if (nums[i]==2){
                c++;
            }
        }
        for (int i = 0; i < a; i++) {
            nums[i] = 0;
        } for (int i = a; i < a+b; i++) {
            nums[i] = 1;
        } for (int i = a+b; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
