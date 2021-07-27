package com.org.app.myfirstrestapi.repo;

import com.org.app.myfirstrestapi.entity.Subject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,String>{
    
}
