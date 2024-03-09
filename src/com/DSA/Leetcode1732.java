package com.DSA;

public class Leetcode1732 {
    public static void main(String[] args) {

    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (max < current){
                max = current;
            }

        }

        return max;
    }
}
