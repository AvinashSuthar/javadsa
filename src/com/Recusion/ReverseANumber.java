package com.Recusion;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 34465;
        reverseNumber2(n);
        System.out.println(sum);
        System.out.println(reverseNumber(n));
    }
    static int reverseNumber(int a){
        int reverse = 0;

        if (a<10){
            return a;
        }
//        reverse = (a%10);
        return (a%10)*(int)Math.pow(10, (int)(Math.log10(a))) +  reverseNumber(a/10);
    }
    static int sum = 0;

    static void reverseNumber2(int a){

        if (a==0){
            return;
        }
//        reverse = (a%10);
       sum = (sum * 10)+ a%10;
        reverseNumber2(a/10);

    }
}
