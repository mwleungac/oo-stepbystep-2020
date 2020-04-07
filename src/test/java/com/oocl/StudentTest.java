package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void display_student_line() {

        Student student = new Student();
        student.setAge(18);
        student.setName("Tom");

        studentClass cls = new studentClass();
        cls.setName("2");
        student.setClassNo(cls);    //pass setName to Student class


        System.out.println(student.introduce());

       // Assert.assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL.\n", student.introduce());

    }
}