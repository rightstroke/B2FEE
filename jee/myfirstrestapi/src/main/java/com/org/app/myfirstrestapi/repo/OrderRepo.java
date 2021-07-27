package com.org.app.myfirstrestapi.repo;

import java.util.List;

import com.org.app.myfirstrestapi.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
    
    //@Query("select c from Order c")
    @Query("select c from MobileOrder c")
    public List<Order> getAllOrders();
}
