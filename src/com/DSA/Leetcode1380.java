package com.DSA;
import java.util.*;
public class Leetcode1380 {
    public static void main(String[] args) {

       int[][] arr =  {
               {3,7,8},
               {9,11,13},
               {15,16,17}
       };
        System.out.println(luckyNumbers(arr));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int indexMin = findMin(matrix[i]);
            System.out.println(matrix[i][indexMin]);
            boolean max = false;
            for (int j = 0; j < matrix.length; j++) {
                 max = findMax(matrix, matrix[i][indexMin],indexMin);
                System.out.println(max);

            }
            if (max){
                arr.add(matrix[i][indexMin]);
            }
            System.out.println();
        }

        return arr;
    }
    static int findMin(int[] row){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row.length; i++) {
            if (min>row[i]){
                min  = i;
            }

        }
        return min;
    }
    static boolean findMax(int[][] mat, int min  , int col){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            if(min<mat[i][col]){
               return false;
            }
        }
        return true;
    }
}
