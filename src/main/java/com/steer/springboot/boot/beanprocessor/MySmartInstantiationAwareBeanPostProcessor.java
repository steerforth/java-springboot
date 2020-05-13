package com.steer.springboot.boot.beanprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
    Logger log = LoggerFactory.getLogger(MySmartInstantiationAwareBeanPostProcessor.class);

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("SmartInstantiationAwareBeanPostProcessor 预测bean类型，加载bean:{},beanClass:{}", beanName,beanClass.toString());
        }
        return null;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("SmartInstantiationAwareBeanPostProcessor 选择构造器，加载bean:{}", beanName);
        }
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("SmartInstantiationAwareBeanPostProcessor 提前暴露引用，加载bean:{}", beanName);
        }
        return null;
    }
}
