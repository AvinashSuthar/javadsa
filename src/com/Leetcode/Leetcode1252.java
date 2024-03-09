package com.Leetcode;

public class Leetcode1252 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m , n , indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
//        for (int i = 0; i < indices.length; i++) {
//            for (int j = 0; j < indices[i].length; j++) {
//                intcrementRow(arr, row);
//                intcrementCol(arr, col);
//
//            }
//
//        }
        for (int i = 0; i < indices.length; i++) {
            intcrementRow(arr, indices[i][0]);

        }
        for (int i = 0; i < indices.length; i++) {
            intcrementCol(arr, indices[i][1]);

        }
        return oddCount(arr);
    }
    private static int oddCount(int[][] arr){
        int count = 0;
        for (int[] ar:arr) {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i]%2 != 0){
                    count++;
                }

            }
        }
        return count;
    }
    private static void intcrementRow(int[][] arr ,int row){
        for (int i = 0; i < arr[row].length; i++) {
            arr[row][i]++;

        }
    }
    private static void intcrementCol(int[][] arr , int col){
        for (int i = 0; i < arr.length; i++) {
            arr[i][col]++;

        }
    }
}
