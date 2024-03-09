package com.DSA;

import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int[] arr = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int m = digits.length+1;
        int[] ans = new int[m];
;
        boolean all9 = false;
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        if (digits[digits.length - 1] == 9) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i] += 1;
                    return digits;
                } else {
                    digits[i] = 0;
                    all9 = true;
                }
            }
            if (all9) {
                m = digits.length + 1;

                ans[0] = 1;
                return ans;


            }
        }
        return ans;
    }
}
