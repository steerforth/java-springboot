package com.steer.springboot.boot.beanprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanProcessor implements BeanPostProcessor {
    private Logger log = LoggerFactory.getLogger(MyBeanProcessor.class);
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("beanprocessor 初始化前，加载bean:{}", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("beanprocessor 初始化后，加载bean:{}",beanName);
        }
        return bean;
    }
}
