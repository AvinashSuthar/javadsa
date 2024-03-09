package com.Recusion;

public class Pattern {
    public static void main(String[] args) {
        pattern2(4,0);
    }
    public  static void pattern(int n){
        if (n<0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");

        }
        System.out.println();
        pattern(n-1);
    }

    public  static void pattern2(int r , int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print(" * ");
            pattern2(r,c+1);
        }
        else {
            System.out.println();
            pattern2(r-1, 0);
        }
    }
}
