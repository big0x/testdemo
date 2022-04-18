package com.atmosware.testdemo.business.concretes;

import com.atmosware.testdemo.business.common.exceptions.BusinessException;
import com.atmosware.testdemo.entities.concretes.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students = new ArrayList<Student>();

    public StudentManager(){
        students.add(new Student(1,"Engin"));
        students.add(new Student(2,"Fatih"));
        students.add(new Student(3,"Orhan"));
        students.add(new Student(4,"Kıvanç"));
        students.add(new Student(5,"Burak Can"));
    }
    //Success : 1
    //Failure : 0
    public void add(Student addedStudent){
        checkIfStudentExists(addedStudent);
       students.add(addedStudent);
    }
    private void checkIfStudentExists(Student addedStudent) {

        for (Student student :students) {
            if (addedStudent.getName()==student.getName()){
                throw new BusinessException("Bu öğrenci mevcut.");
            }
        }
    }
}
