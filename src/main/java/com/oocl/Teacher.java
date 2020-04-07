package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

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
        return String.format("My name is %s. I am %s years old. Teaching for the future of world.\n", this.getName(), this.getAge());
    }
}
