package com.Recusion;

public class FibonacciSeries {
    public static void main(String[] args) {
//        System.out.println(fibonacci(3));
        System.out.println(fiboFormula(3));
    }


    static  int fiboFormula(int n){
        return Math.round((int)(Math.pow( ((1+ Math.sqrt(5)) / 2)  ,n )/ Math.sqrt(5)));
    }

    static int fibonacci(int n ){
        if (n<2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
