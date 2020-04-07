package com.oocl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class studentClass {

    private String name;
    private List<Student> allStudent = new ArrayList<Student>(); // a class can hv many students
    private Student classLeader;        // one leader in a class
    private Teacher teacher;            // one teacher in a class


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public void setClassLeader(Student classLeader) {
        if (allStudent.contains(classLeader)) {      // student in class can be leader
            this.classLeader = classLeader;

        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public String addToClass(final Student student) {
        if(!allStudent.contains(student)) {         //add student to studentClass
          allStudent.forEach(otherStudent -> otherStudent.welcome(student, this));

            teacher.welcome(student, this);
            this.allStudent.add(student);
        }
          return null;
    }

    public String leaderAssignedToClass (Student student){
        this.setClassLeader(student);
        allStudent.forEach(otherStudent -> otherStudent.welcome(student, this));
        teacher.welcomeLeader(student, this);

        return null;
    }

}
