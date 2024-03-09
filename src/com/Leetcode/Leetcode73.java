package com.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode73 {
    public static void main(String[] args) {
        int[][] ar1  = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] ar  = {{0,1}};

        setZeroes(ar);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");

            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(ar));
    }
    public static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> zeros = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0){
                    zeros.add(new ArrayList<>(Arrays.asList(i, j)));
                }

            }
        }
        System.out.println(zeros);
        for (int i = 0; i < zeros.size(); i++) {
            setzero(matrix, zeros.get(i));


        }


    }
    private static void setzero(int[][] matrix, ArrayList<Integer> index){
        int j = index.get(1);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][j] = 0;

        }
        int k = index.get(0);
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[k][i] = 0;

        }
    }
}
