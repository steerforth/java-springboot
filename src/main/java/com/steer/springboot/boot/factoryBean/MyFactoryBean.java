package com.steer.springboot.boot.factoryBean;

import com.steer.springboot.boot.entity.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * 常用于第三方框架的使用
 *
 * 将第三方的配置信息写在xml中，注入spring IOC容器中
 */
public class MyFactoryBean implements FactoryBean<Student> {
    private String stuId;
    private Integer age;
    private String stuName;
    private boolean sex;
    /**
     * 自定义配置的bean
     * @return
     * @throws Exception
     */
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        student.setId(stuId);
        student.setAge(age);
        student.setName(stuName);
        student.setSex(sex);
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

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
