package com.OOP;

public class Statickeyword {
    public static void main(String[] args) {
        Human avinash = new Human(22, "Avinash" , 123421, true);
        Human avinash1 = new Human(22, "Avinash" , 123421, true);

        System.out.println(Human.population);
    }
}
