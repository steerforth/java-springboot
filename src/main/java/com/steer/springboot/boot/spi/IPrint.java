package com.steer.springboot.boot.spi;

/**
 * 消息打印类
 */
public interface IPrint extends ISpi<Integer> {

    default void execute(Integer level, Object... msg) {
        print(msg.length > 0 ? (String) msg[0] : null);
    }

    void print(String msg);
}
