package com.arc.example.ex1;

public interface Sayable1 {
    default void say1(){
        System.out.println("Hello, this is default method");
    }
}
