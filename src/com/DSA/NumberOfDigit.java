package com.DSA;

public class NumberOfDigit {
    public static void main(String[] args) {
        int n = 12343;
        int base =  10;
        System.out.println(countDigitInBinary(n , base));
    }
    static int countDigitInBinary(int n, int b){
        return (int)((Math.log(n)/Math.log(b)) + 1);
    }
}
