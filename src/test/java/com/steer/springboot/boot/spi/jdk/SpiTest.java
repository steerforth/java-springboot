package com.steer.springboot.boot.spi.jdk;

import org.junit.Test;

import java.util.ServiceLoader;

public class SpiTest {

    @Test
    public void test(){
        ServiceLoader<Animal> serviceLoader = ServiceLoader.load(Animal.class);
        serviceLoader.forEach(Animal::eat);
    }
}
