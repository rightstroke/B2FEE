package com.org.app.myfirstrestapi.repo;

import com.org.app.myfirstrestapi.entity.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {
    
}
