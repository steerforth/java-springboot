package com.steer.springboot.boot.spi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogPrint implements IPrint {
    private Logger log = LoggerFactory.getLogger(LogPrint.class);
    @Override
    public void print(String msg) {
        log.info("log print: {}", msg);
    }

    @Override
    public boolean verify(Integer level) {
        return level>0;
    }
}
