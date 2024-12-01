package com.codeforfun.ehcache.spring_ehcache_impl.service;

import com.codeforfun.ehcache.spring_ehcache_impl.model.Employee;

public interface EmployeeService {

    /**
     * Method to get Employee by first name of the employee
     * @param firstName - Employee's first name
     * @return Employee
     */
    Employee getEmployeeByFirstName(String firstName);
}
