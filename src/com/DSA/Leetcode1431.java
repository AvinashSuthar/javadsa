package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Leetcode1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
//        System.out.println(Arrays.toString(kidsWithCandies(candies, extraCandies).toArray());
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = findMax(candies);
        System.out.println(max);
        System.out.println(Arrays.toString(candies));
        for (int i = 0 ; i< candies.length ; i++) {
            System.out.println(candies[i]);

           if ((candies[i] + extraCandies) >= max){
//               System.out.println(true);
               ans.add(i , true);
           }
           else {
               ans.add(i , false);
//               System.out.println(false);
           }


        }
        return ans;
    }
    public static int findMax(int[] arr){
        int max = 0;
        for(int num : arr){
            if (num>max){
                max =num;
            }
        }
        return max;
    }
}
