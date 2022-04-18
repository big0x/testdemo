package com.atmosware.testdemo.businessTests;

import com.atmosware.testdemo.business.common.exceptions.BusinessException;
import com.atmosware.testdemo.business.concretes.StudentManager;
import com.atmosware.testdemo.entities.concretes.Student;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentManagerTests {
    StudentManager studentManager;

    @BeforeEach
    public void setup(){
        studentManager = new StudentManager();
    }
//    @AfterEach//nadiren kullanılır
//    public void cleanup(){
//
//    }
//    @BeforeAll
//    public void initialize(){
//
//    }
//    @AfterAll
//    public void finish(){
//
//    }

    @Test
    public void should_throw_business_exception_if_student_exists1(){

        Executable executable = () -> studentManager.add(new Student(1,"Engin"));

        assertThrows(BusinessException.class,executable);

    }
    @Test
    public void should_throw_business_exception_if_student_exists2(){

        Executable executable = () -> studentManager.add(new Student(1,"Fatih"));

        assertThrows(BusinessException.class,executable);

    }
}
