package com.DSA;

public class mountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = start; start < end; i++) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                mid = end;
            } else {
                start = mid + 1;
            }
        }


        return start;
    }
}
