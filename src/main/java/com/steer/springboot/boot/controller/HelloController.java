package com.steer.springboot.boot.controller;

import com.steer.springboot.boot.entity.Student;
import com.steer.springboot.boot.factoryBean.MyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private Logger log = LoggerFactory.getLogger(HelloController.class);

//    @Autowired
//    private MyFactoryBean factoryBean;

    @GetMapping("")
    public Object hello(){
        return "hi";
    }

//    @GetMapping("/bean")
//    public Object bean() throws Exception {
//        Student s1 = factoryBean.getObject();
//        Student s2 = factoryBean.getObject();
//        log.info("s1:{}  s2:{}",s1.toString(),s2.toString());
//        return s1.toString();
//    }


}
