package com.oocl;

import org.junit.Assert;
import  org.junit.Test;

public class ClassNotificationTest {

    @Test
    public void shdNotifyWhenStudentJoinClass(){

        studentClass cls = new studentClass();
        cls.setName("2");

        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);

        cls.setTeacher(teacher);            // assign teacher to class

        Student student = new Student();    // new student object
        student.setName("Tom");

        cls.addToClass(student);        // add new student

        System.out.println(teacher.getMessage());

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2", teacher.getMessage());

    }

    @Test
    public void shdNotifyWhenLeaderAssigned(){
        studentClass cls = new studentClass();
        cls.setName("2");

        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);

        cls.setTeacher(teacher);            // assign teacher to class

        Student student = new Student();    // new student object
        student.setName("Tom");

        cls.leaderAssignedToClass(student);        // new leader to the class

        System.out.println(teacher.getMessage());

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2", teacher.getMessage());
    }

}
