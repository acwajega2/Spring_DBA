package com.wacsoft.dba.Controller;


import com.wacsoft.dba.Database.Students.Student;
import com.wacsoft.dba.Services.Students.StudentServiceM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private StudentServiceM studentServiceM;

    @GetMapping(path = "/findAllStudents",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> findAllStudents(){
        return studentServiceM.findAll();
    }



    @GetMapping(path = "/findStudentByName/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> findStudentByName2(@PathVariable String name){
        return studentServiceM.findByName(name);
    }

    @PostMapping(path ="/saveStudent",produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveStudent2(@RequestBody Student student){

        return studentServiceM.saveStudent(student);
    }
}
