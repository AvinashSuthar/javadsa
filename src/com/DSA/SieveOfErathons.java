package com.DSA;

public class SieveOfErathons {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(40, primes);
    }
    static void sieve(int n , boolean[] primes){
        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i * i <= n ; i++) {
            if (!primes[i]){
                for (int j = i*2; j<= n ; j +=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (!primes[i]){

            System.out.print(i + "  ");
            }

        }
    }
}
