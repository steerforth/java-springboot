package com.steer.springboot.boot.service.impl;

import com.steer.springboot.boot.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void hi(String content) {
        System.out.println(content);
    }
}
