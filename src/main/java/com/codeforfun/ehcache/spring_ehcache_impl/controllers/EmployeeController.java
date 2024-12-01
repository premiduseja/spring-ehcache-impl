package com.codeforfun.ehcache.spring_ehcache_impl.controllers;

import com.codeforfun.ehcache.spring_ehcache_impl.model.Employee;
import com.codeforfun.ehcache.spring_ehcache_impl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/firstName/{firstName}")
    public HttpEntity<Employee> getEmployeeByFirstName(@PathVariable("firstName") String firstName){

        Employee employee=employeeService.getEmployeeByFirstName(firstName);
        HttpEntity<Employee> response;
        if(employee!=null)
            response=new ResponseEntity<Employee>(employee, HttpStatus.OK);
        else
            response=new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

        return response;
    }

    @GetMapping("/check")
    String test(){
        return "UP";
    }

}
