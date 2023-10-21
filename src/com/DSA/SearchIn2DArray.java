package com.DSA;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,6},
                {4,5,6},
                {9,1,0}
        };
        int target = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(target == arr[i][j]){
                    System.out.println("find at : " + i + " , " + j);
                }
            }
        }

    }
}
