package com.oocl;

public class Student extends Person{
    private int studentClassNum;
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
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of class %d. Coding for the glory of OOCL. IsClassLeader: %b\n", this.getName(), this.getAge(),this.getStudentClassNum(),this.IsClassLeader);
    }

}
