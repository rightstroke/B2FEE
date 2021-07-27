package com.org.app.myfirstrestapi.repo;

import java.util.List;

import com.org.app.myfirstrestapi.entity.College;
import com.org.app.myfirstrestapi.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer> {

    @Query("select c.students from College c where c.id = :collegeID")
    public List<Student> fetchStudentsByCollegeId(Integer collegeID);


}
