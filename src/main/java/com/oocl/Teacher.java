package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private String welcomeMessage;

    private List<studentClass> classesToTeach = new ArrayList<studentClass>(); // a teacher can teach many classes

    public List<studentClass> getClassesToTeach() {
        return classesToTeach;
    }

    public void setClassesToTeach(List<studentClass> classesToTeach) {
        if(classesToTeach.size()<5) {                   // a teacher can teach many classes
            this.classesToTeach = classesToTeach;
        }
        /*else{
        return;
        }*/
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. Teaching for the future of world. ", this.getName(), this.getAge());
    }

    public String getMessage() {
    return welcomeMessage;

    }

    public void welcome(Student student, studentClass studentClass) {        //add this welcome msg to getMessage()
        welcomeMessage = introduce() +
        String.format("Welcome %s join Class %s", student.getName(),studentClass.getName());
      //  welcomeMessage = "My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2";
    }

    public void welcomeLeader(Student student, studentClass studentClass) {
        welcomeMessage = introduce() +
                String.format("%s is the leader of Class %s", student.getName(),studentClass.getName());
    }
}
