package com.DSA;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(10);
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" # ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    static void pattern2(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(" # ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    static void pattern3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(" " + j + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    static void pattern4(int n){
            int c = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= n/2){
                c++;
            }
            else {
                c--;
            }
//            c  = (i<= n/2) ? (c++) : (c--) ;
            for (int j = 1; j <= c; j++) {
                System.out.print(" # ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
