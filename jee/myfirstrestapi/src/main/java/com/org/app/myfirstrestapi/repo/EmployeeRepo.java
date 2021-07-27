package com.org.app.myfirstrestapi.repo;

import java.util.List;

import com.org.app.myfirstrestapi.entity.Employee;
import com.org.app.myfirstrestapi.entity.EmployeeJoin;
import com.org.app.myfirstrestapi.entity.EmployeePhoneJoin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    
    // @Query("select new com.org.app.myfirstrestapi.entity.EmployeeJoin(e.id,e.name) from Employee e LEFT JOIN e.phones ep where e.id=ep.emp.id")
    // public List<EmployeeJoin> getData();

    //@Query("select new com.org.app.myfirstrestapi.entity.EmployeePhoneJoin(e.id,e.name,ep.pNumber) from Employee e LEFT JOIN e.phones ep where e.id  = ep.emp.id")
    //jpql
    @Query("select new com.org.app.myfirstrestapi.entity.EmployeePhoneJoin(e.id,e.name,ep.pNumber) from Employee e LEFT JOIN e.phones ep where e.id  = ep.emp.id")
    public List<EmployeePhoneJoin> getEmployees();
}


