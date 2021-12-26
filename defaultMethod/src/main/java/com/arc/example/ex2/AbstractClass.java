package com.arc.example.ex2;

public abstract class AbstractClass {
    public AbstractClass() {        // constructor
        System.out.println("You can create constructor in abstract class");
    }
    public abstract int add(int a, int b); // abstract method
    public int sub(int a, int b){      // non-abstract method
        return a-b;
    }
    static int multiply(int a, int b){  // static method
        return a*b;
    }
}
