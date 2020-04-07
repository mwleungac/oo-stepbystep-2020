package com.oocl;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private studentClass cls;
    //private String welcomeMessages;
    private ArrayList<String> welcomeMessages= new ArrayList<String>();

    @Override
    public studentClass getClassNo() {

        return cls;
    }

   // @Override
    public void setClassNo(studentClass cls) {

        this.cls = cls;
    }

    @Override
    public String introduce() {
           return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.", this.getName(), this.getAge(),this.getClassNo().getName());
    }

    public void addToClass(studentClass cls){
        cls.addToClass(this);

    }

    public ArrayList<String> getWelcomeMessages() {
        return welcomeMessages;

    }

    public void welcome(Student student, studentClass cls){
      // String welcomeMessage = introduce() +
        //     String.format("Welcome %s join Class %s", student.getName(),cls.getName());
       String welcomeMessage = String.format("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.");
        this.welcomeMessages.add(welcomeMessage);

    }







    /*  private int studentClassNum;
    private boolean IsClassLeader;

    public boolean isClassLeader() {
        return IsClassLeader;
    }

    public void setClassLeader(boolean classLeader) {
        IsClassLeader = classLeader;

    }

    public int getStudentClassNum() {
        return studentClassNum;
    }

    public void setStudentClassNum(int studentClassNum) {
        this.studentClassNum = studentClassNum;
    }*/



}
