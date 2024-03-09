package com.DSA;

import java.util.ArrayList;
import java.util.List;
//import java.util.Arrays;

public class Leetcode989 {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(arr, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = 0;
        ArrayList<Integer> arr =new ArrayList<>();
        if (num.length>7){
            for (int i = 0; i < num.length - 6; i++) {
                arr.add(num[i]);
            }
        }
            for (int i = 0; i < num.length; i++) {
                n += num[i];
                n *= 10;
            }
                n/= 10;
                n+= k;
                System.out.println(n);
            for (int i = (int)(Math.log10(n)); i >=0; i--) {
                arr.add(n/(int)Math.pow(10, i));
                n = n% (int)Math.pow(10, i);
            }


            return arr;




    }
}
