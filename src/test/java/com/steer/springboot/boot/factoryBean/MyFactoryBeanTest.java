package com.steer.springboot.boot.factoryBean;

import com.steer.springboot.boot.BootApplicationTests;
import com.steer.springboot.boot.entity.Student;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFactoryBeanTest extends BootApplicationTests {
    Logger log = LoggerFactory.getLogger(MyFactoryBeanTest.class);
    @Autowired
    private MyFactoryBean custom;

    @Test
    public void test() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        //一.通过xml配置
        //1.通过&来获取MyfactoryBean
        MyFactoryBean factoryBean = (MyFactoryBean) context.getBean("&beanfactory");
        Student stu1 = factoryBean.getObject();
        log.info("==={}",stu1.toString());
        //2.直接获取student对象
        Student stu2 = (Student)context.getBean("beanfactory");
        log.info("==={}",stu2.toString());


        //二.通过@Configuration
        log.info("---{}",custom.getObject().toString());

    }
}
