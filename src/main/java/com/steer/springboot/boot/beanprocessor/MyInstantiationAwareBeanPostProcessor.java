package com.steer.springboot.boot.beanprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    private Logger log = LoggerFactory.getLogger(MyInstantiationAwareBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("InstantiationAwareBeanPostProcessor 初始化前，加载bean:{}", beanName);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("InstantiationAwareBeanPostProcessor 初始化后，加载bean:{}", beanName);
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("InstantiationAwareBeanPostProcessor 属性处理，加载bean:{}，属性：{}", beanName,pvs.toString());
        }
        return null;
    }
}
