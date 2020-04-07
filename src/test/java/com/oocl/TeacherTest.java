package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void display_teacher_line() {
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(18);

        System.out.println(teacher.introduce());

        Assert.assertEquals("My name is Woody. I am 18 years old. Teaching for the future of world.\n", teacher.introduce());

    }
}