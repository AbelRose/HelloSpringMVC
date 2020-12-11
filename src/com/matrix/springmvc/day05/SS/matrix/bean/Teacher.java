package com.matrix.springmvc.day05.SS.matrix.bean;

public class Teacher {

    private Integer id;
    private String name;

    public Teacher() {

        System.out.println("Teacher >>> 构造方法");

    }

    public Teacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }




}
