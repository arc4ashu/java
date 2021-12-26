package com.arc.example.ex2;

public class AbstractTest extends AbstractClass{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        AbstractTest a = new AbstractTest();
        int result1 = a.add(20, 10);    // calling abstract method
        int result2 = a.sub(20, 10);    // calling non-abstract method
        int result3 = AbstractClass.multiply(20, 10); // calling static method
        System.out.println("Addition: "+result1);
        System.out.println("Substraction: "+result2);
        System.out.println("Multiplication: "+result3);
    }
}
