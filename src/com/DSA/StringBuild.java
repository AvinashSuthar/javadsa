package com.DSA;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' +  i);
            builder.append(ch);
// it is not creating new objects it is adding in previous one  it is mutable

        }
        System.out.println(builder.toString());

    }
}
