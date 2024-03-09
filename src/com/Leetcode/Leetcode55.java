package com.Leetcode;

public class Leetcode55 {
    public static void main(String[] args) {

    }
    public static boolean canJump(int[] nums) {
        boolean ans = false;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + i == nums.length-1 ){
                return true;
            }


        }

        return ans;
    }
}
