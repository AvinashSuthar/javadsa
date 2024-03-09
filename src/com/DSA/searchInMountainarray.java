package com.DSA;

public class searchInMountainarray {
    int search(int[] arr, int targate) {

        int peak =peakIndexInMountainArray(arr);
int firsttry = asBinarySearch(arr,targate,0,peak);
    }

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
    static int asBinarySearch(int[] arr,int target,int s ,int e ){


        int s = 0;
        int e = arr.length-1;

        while (s<=e){
            int m = s + (e-s)/2;
            if (target<arr[m]){
                e = m-1;
            } else if (target>arr[m]) {
                s = m+1;
            } else {
                return m;
            }

        }

        return -1;

    }
}
