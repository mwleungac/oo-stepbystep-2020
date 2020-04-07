package com.oocl;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;

public class Person {
    private String name;
    private Integer age;
    private studentClass cls;

    public studentClass getClassNo() {
        return cls;
    }

    public void setClassNo(studentClass classNo) {
        this.cls = cls;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old.\n", name, age);
    }
}
