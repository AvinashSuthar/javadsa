package com.OOP;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population = 0;
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
