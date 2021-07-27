package com.org.app.myfirstrestapi.repo;

import com.org.app.myfirstrestapi.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
    
}
