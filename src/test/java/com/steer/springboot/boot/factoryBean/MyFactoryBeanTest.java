package com.steer.springboot.boot.factoryBean;

import com.steer.springboot.boot.entity.Student;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFactoryBeanTest {
    Logger log = LoggerFactory.getLogger(MyFactoryBeanTest.class);
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        Student stu = (Student)context.getBean("beanfactory");
        log.info("==={}",stu.toString());
    }
}
