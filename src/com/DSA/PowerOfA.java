package com.DSA;

public class PowerOfA {
    public static void main(String[] args) {
        System.out.println(AToThePowerB(2, 7));
    }
    static int AToThePowerB(int a, int b){
        int ans = 1 ;
        int base  = a;
//        int digitOfB = (int) ((Math.log(b)/Math.log(2)) + 1);
        while (b>0){
            if ((b & 1) != 0){
                ans = ans * base;
            }
            b = b >> 1;
            base = base * base;
        }


        return ans;
    }
}
