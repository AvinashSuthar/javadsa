package com.DSA;

public class NewtonRaphsonSQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }
    static double sqrt(int n){
        double root;
        double x = n;

        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }


        return root;

    }
}
