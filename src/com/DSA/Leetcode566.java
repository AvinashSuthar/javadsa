package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode566 {
    public static void main(String[] args) {
       int[][] mat =  {
            {1,2,3,4}

        };
       int r = 2;
       int c = 2;
        System.out.println(Arrays.toString(matrixReshape(mat, r,c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int nr=0, nc= 0;
        int[][] newMat = new int[r][c];
        ArrayList<Integer> arr = new ArrayList<>();
        if (mat.length * mat[0].length != r*c){
            return mat;
        }
        else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    newMat[nr][nc] = (mat[i][j]);
                    if (nc < c-1){
                        nc += 1;
                    }
                    else {
                        nr += 1;
                        nc = 0;
                    }
                }
            }
//            for (int i = 0; i < r; i++) {
//                for (int j = 0; j < c; j++) {
//                    newMat[i][j] = arr.get(al);
//                }
//
//            }
            return newMat;
        }
    }
}
