package com.DSA;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNumber(1));
        System.out.println(magicNumber(2));
        System.out.println(magicNumber(3));
        System.out.println(magicNumber(4));
        System.out.println(magicNumber(5));
        System.out.println(magicNumber(6));
    }
    static int magicNumber(int n ){
        int ans = 0 ;
        for (int i = 0; n> 0 ; i++) {
            int digit = n&1 ;
            n = n>>1;
            ans = (int)(ans + (digit * Math.pow(5 , i + 1)));
        }
        return ans;
    }
}
