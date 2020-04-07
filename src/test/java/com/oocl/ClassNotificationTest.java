package com.oocl;

import org.junit.Assert;
import  org.junit.Test;

import java.util.List;

public class ClassNotificationTest {

    @Test
    public void shdNotifyWhenStudentJoinClass() {

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
    public void shdNotifyWhenLeaderAssigned() {
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

    @Test
    public void shdNotifyOtherStudentsWhenStudentJoinClass() {

        studentClass cls = new studentClass();
        cls.setName("2");

        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        cls.setTeacher(teacher);            // assign teacher to class

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        tom.setClassNo("2");
        cls.addToClass(tom);

        Student jim = new Student();
        jim.setName("Jim");
        jim.setAge(18);
        cls.addToClass(jim);

        System.out.println(tom.getWelcomeMessages());
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.", tom.getWelcomeMessages());

    }

    @Test
    public void shdNotifyOtherStudentsWhenLeaderAssigned() {

        studentClass cls = new studentClass();
        cls.setName("2");

        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(30);
        cls.setTeacher(teacher);            // assign teacher to class

        Student tom = new Student();
        tom.setName("Tom");
        tom.setAge(18);
        tom.setClassNo("2");
        cls.addToClass(tom);

        Student jim = new Student();
        jim.setName("Jim");
        jim.setAge(18);

        cls.leaderAssignedToClass(jim);     //leader assigned to class

        System.out.println(tom.getWelcomeMessages());
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.", tom.getWelcomeMessages());

    }
}
