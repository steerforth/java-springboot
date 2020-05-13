package com.steer.springboot.boot.spi.jdk;

import com.steer.springboot.boot.BootApplicationTests;
import com.steer.springboot.boot.factoryBean.MyFactoryBeanTest;
import com.steer.springboot.boot.spi.IPrint;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PrintSpiTest extends BootApplicationTests {
    Logger log = LoggerFactory.getLogger(MyFactoryBeanTest.class);
    @Autowired
    private IPrint print;

    @Test
    public void test(){
        print.execute(0,"ni hao");
        print.execute(1,"ni hao");
    }
}
