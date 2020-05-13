package com.steer.springboot.boot.spi;

public interface ISpi<T> {
    boolean verify(T level);

    /**
     * 找到多个子类实现时，按优先级执行
     * @return
     */
    default int order(){
        return 10;
    }
}
