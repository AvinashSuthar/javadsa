package com.Recusion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfdigit(-123));
    }
    static int sumOfdigit(int n){
        if (n<1){
            return 0;
        }
        int remainder = n % 10;

        return remainder + sumOfdigit(n/10);
    }
}
