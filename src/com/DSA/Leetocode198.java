package com.DSA;

public class Leetocode198 {
    public static void main(String[] args) {
        int[] arr = {2,4,2};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        int even=0;
        int odd=0;
        int twospace =0;
        int cur=0;
            twospace = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                even += nums[i];
            }  if (i%2!=0){
                odd += nums[i];
            }
            if (i-cur==3){
                cur = i;
            twospace += nums[cur];
            }
        }
//        System.out.println(twospace);
        int max = 0;
        if (even>=odd){
            max = even;
        }
        else if (even<odd){
            max =  odd;
        }else if (max>twospace){
            max =  max;
        }
        else {
            max = twospace;
        }
        return max;
    }
}
