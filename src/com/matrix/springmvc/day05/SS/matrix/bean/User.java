package com.matrix.springmvc.day05.SS.matrix.bean;

import org.springframework.stereotype.Component;

@Component
public class User {

    private int age;
    private String name;

    public User() {
        System.out.println("User >>> 构造方法");
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
