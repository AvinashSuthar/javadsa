package com.Leetcode;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] ans  = new int[2];
        int s = 0;
        int e = nums.length-1;
        int m = 0;
        int index = -1;
        if(nums.length<1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        while(s<=e){
            m = s + (e-s)/2;
            if(target ==nums[m]){
                index = m;
                break;
            }
            if(target>nums[m]){
                s = m + 1;
            }
            if(target<nums[m]){
                e = m - 1;
            }

        }
        // System.out.println(index);
        if(index == -1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        else{
            for(int i = index ; i<nums.length; i++){
                int count = 0;
                if (nums[i]==target){
                    count++;
                }

                ans[1] = i+count-1;
                if (nums[i] != target){
                    break;
                }

            }
            for(int i = index; i>=0; i--){
                int count = 0;
                if (nums[i]==target){
                    count++;
                }
                ans[0] = i-count+1;
                if (nums[i] != target){
                    break;
                }
            }
        }
        return ans;
    }
}
