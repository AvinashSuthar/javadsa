package com.Leetcode;

public class Leetcode4 {
    public static void main(String[] args) {
        int[] ar1 = {1,3};
        int[] ar2 = {3};
        System.out.println(findMedianSortedArrays(ar1, ar2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid1 = findMedian(nums1);
        double mid2 = findMedian(nums2);
//        System.out.println(mid1 + " " + mid2);
        return  (mid1 + mid2)/2.0;
    }
    private static double findMedian(int[] arr){
        int s = 0;
        int e = arr.length;
        int m = s + (e-s)/2;
        if (arr.length==1){
            return arr[0];
        }else if(arr.length%2==0){
            return ((float)(arr[m] + arr[m-1]))/2.0;
        }
        else{
            return m;
        }
    }
}
