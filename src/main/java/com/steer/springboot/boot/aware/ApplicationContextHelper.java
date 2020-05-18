package com.steer.springboot.boot.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHelper implements ApplicationContextAware {
    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return ctx;
    }

    public Object getBean(String beanName) {
        return ctx.getBean(beanName);
    }

    public <T> T getBean(Class<T> clazz) {
        return ctx.getBean(clazz);
    }

    public <T> T getBean(String beanName, Class<T> clazz) {
        try {
            return ctx.getBean(beanName, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
