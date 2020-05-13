package com.steer.springboot.boot.factoryBean;

import com.steer.springboot.boot.entity.Student;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Student> {

    /**
     * 自定义配置的bean
     * @return
     * @throws Exception
     */
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        student.setId("11");
        student.setAge(18);
        student.setName("张三");
        student.setSex(true);
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    /**
     * 是否为单例对象
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
