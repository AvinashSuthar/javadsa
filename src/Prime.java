package com.questions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i*i < n; i++){
            if(n%i==0){
                prime = false ;
            }
        }
        if (prime){
            System.out.println("prime");
        }
    }
}
