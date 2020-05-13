package com.steer.springboot.boot.spi.jdk;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
}
