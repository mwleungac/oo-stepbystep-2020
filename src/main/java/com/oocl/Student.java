package com.oocl;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;

public class Student extends Person{

    private studentClass cls;

    @Override
    public studentClass getClassNo() {
        return cls;
    }

    @Override
    public void setClassNo(studentClass cls) {
        this.cls = cls;
    }

    @Override
    public String introduce() {
           return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.\n", this.getName(), this.getAge(),this.getClassNo().getName());
    }

    public void toJoinClass(studentClass cls){  //add student to studentClass
        cls.addToClass(this);

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
