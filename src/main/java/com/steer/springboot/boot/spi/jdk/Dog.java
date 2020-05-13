package com.steer.springboot.boot.spi.jdk;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }
}
