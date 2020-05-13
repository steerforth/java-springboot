package com.steer.springboot.boot.config;

import com.steer.springboot.boot.factoryBean.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {
    @Bean
    public MyFactoryBean customBean(){
        MyFactoryBean bean = new MyFactoryBean();
        bean.setStuId("1123");
        bean.setAge(17);
        bean.setStuName("李四");
        bean.setSex(true);
        return bean;
    }
}
