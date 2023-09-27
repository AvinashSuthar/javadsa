package avinash;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//        if we are giving as input of integer and datatype is of float then
//        it is compatible but vice versa will not work;
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println(f);

//        typecasting
        int num = (int)(67.45f);
        System.out.println(num);

        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);
// type promotion rule is that if any expression contains bigger datatype then result will be only that type ;
        // 5*5.6 = float



    }
}
