package com.DSA;

public class Leetcode1832 {
    public static void main(String[] args) {
        String sentence =  "leetcode";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean ans = false;
        boolean[] arr = new boolean[26];
        char ch;
        int ascii;
        for (int i = 0; i < sentence.length(); i++) {

            ch = sentence.charAt(i);
            ascii =  ((int)ch ) - 97;
            if (arr[ascii]){
                continue;
            }
            else {
                arr[ascii] = true;
            }
        }
        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i]){
                count++;
            }
        }
        if (count==26){
            return true;
        }


        return false;
    }
}
