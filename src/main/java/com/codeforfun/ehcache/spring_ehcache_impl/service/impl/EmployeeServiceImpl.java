package com.codeforfun.ehcache.spring_ehcache_impl.service.impl;

import com.codeforfun.ehcache.spring_ehcache_impl.model.Employee;
import com.codeforfun.ehcache.spring_ehcache_impl.repository.EmployeeRepository;
import com.codeforfun.ehcache.spring_ehcache_impl.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Service implementation and caching the response.
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    @Cacheable(key = "#firstName", value = "employeeCache")
    public Employee getEmployeeByFirstName(String firstName) {
        log.debug(">>>>>>>>>>>  Now pulling {} from database..  <<<<<<<<<<<<<<", firstName);
        return employeeRepository.getByFirstName(firstName);
    }
}
