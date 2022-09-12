package com.wacsoft.dba.Database.Students;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentsRepository extends CrudRepository<Student,Long> {
    //---------> List Student By Name
    @Query(value="SELECT * FROM Students WHERE UPPER(name) like %?#{[0].toUpperCase()}%",nativeQuery = true)
    List<Student> findByName(String name);

    //-----------> List All Students
    List<Student> findAll();
}
