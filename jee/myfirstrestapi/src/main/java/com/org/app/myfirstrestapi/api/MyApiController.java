package com.org.app.myfirstrestapi.api;

import java.util.Arrays;
import java.util.List;

import com.org.app.myfirstrestapi.service.CustomerManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApiController extends BaseController {

    @Autowired
    private CustomerManager service;
    
    @GetMapping(value = "/names",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getNames(){
        return service.getNames();
    }

}
