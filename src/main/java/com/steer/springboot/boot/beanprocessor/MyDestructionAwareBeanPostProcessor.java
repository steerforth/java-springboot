package com.steer.springboot.boot.beanprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {
    private Logger log = LoggerFactory.getLogger(MyDestructionAwareBeanPostProcessor.class);
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloController")) {
            log.info("DestructionAwareBeanPostProcessor 销毁之前前，销毁bean:{}", beanName);
        }
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        return true;
    }
}
