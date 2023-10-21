package com.DSA;

public class RangeXor {
    public static void main(String[] args) {
        int startRange = 4;
        int endRange  = 10;
        int xorTillEndRange = findXor(endRange);
        int xorTillStartRange = findXor(startRange - 1);
        int ans = xorTillEndRange ^ xorTillStartRange;
        System.out.println(xorTillStartRange);
        System.out.println(xorTillEndRange);
        System.out.println(ans);
    }


    static int findXor(int a){
        if (a%4  == 0){
            return a;
        }
        if (a%4 == 1){
            return 1;
        }
        if (a%4 == 2){
            return a+1;
        }
        return 0;
    }

}
