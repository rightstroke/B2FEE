package com.org.app.myfirstrestapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerManagerImpl implements CustomerManager{

    @Override
    public List<String> getNames() {
        return Arrays.asList("Test1","Test2","Test3","Test4","Test5");
    }
    
}
