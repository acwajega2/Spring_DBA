package com.wacsoft.dba.Services.Students;

import com.wacsoft.dba.Database.Students.Student;
import com.wacsoft.dba.Database.Students.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceM implements StudentServiceInterface {


    @Autowired
    private StudentsRepository repository;

    @Override
    public List<Student> findAll() {

        return repository.findAll();
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public String saveStudent(Student student) {
        if (student == null){
            return "Failed";
        }
        repository.save(student);
        return "Success";
    }
}
