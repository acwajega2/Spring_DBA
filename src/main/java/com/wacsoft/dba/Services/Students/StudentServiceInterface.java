package com.wacsoft.dba.Services.Students;

import com.wacsoft.dba.Database.Students.Student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> findAll();
    List<Student> findByName(String name);

    String saveStudent(Student student);
}
