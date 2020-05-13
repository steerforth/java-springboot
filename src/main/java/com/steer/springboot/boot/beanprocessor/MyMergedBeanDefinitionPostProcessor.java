package com.steer.springboot.boot.beanprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    private Logger log = LoggerFactory.getLogger(MyMergedBeanDefinitionPostProcessor.class);

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition rootBeanDefinition, Class<?> beanType, String beanName) {
        if (beanName.equals("helloController")) {
            log.info("MergedBeanDefinitionPostProcessor bean合并，bean:{}", beanName);
        }
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        if (beanName.equals("helloController")) {
            log.info("MergedBeanDefinitionPostProcessor 重置bean定义，bean:{}", beanName);
        }
    }
}
