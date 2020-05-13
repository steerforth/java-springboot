package com.steer.springboot.boot.spi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrintAutoConfig {
    @Bean
    public SpiFactoryBean printSpiProxy(ApplicationContext context){
        return new SpiFactoryBean(context,IPrint.class);
    }

    @Bean
    @Primary
    public IPrint printProxy(SpiFactoryBean spiFactoryBean) throws Exception {
        return (IPrint) spiFactoryBean.getObject();
    }
}
