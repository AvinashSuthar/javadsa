package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
//            Integer num = new Integer(nums[i]);
            arr.add(index[i] , nums[i]) ;

        }
        int[] ans = new  int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i]= arr.get(i);
        }
        return ans;
    }
}
