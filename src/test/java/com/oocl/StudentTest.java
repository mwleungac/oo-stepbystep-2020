package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void display_student_line() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);

        System.out.println(student.introduce());

        Assert.assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL.\n", student.introduce());

    }
}