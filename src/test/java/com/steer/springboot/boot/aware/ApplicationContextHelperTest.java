package com.steer.springboot.boot.aware;

import com.steer.springboot.boot.BootApplicationTests;
import com.steer.springboot.boot.service.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationContextHelperTest extends BootApplicationTests {
    @Autowired
    private ApplicationContextHelper helper;

    @Test
    public void test(){
        HelloService service = helper.getBean(HelloService.class);
        service.hi("123");
    }
}
