package com.steer.springboot.boot.spi;

import org.springframework.stereotype.Component;

@Component
public class SystemConsolePrint implements IPrint {
    @Override
    public void print(String msg) {
        System.out.println("system console print: " + msg);
    }

    @Override
    public boolean verify(Integer level) {
        return level <= 0;
    }
}
