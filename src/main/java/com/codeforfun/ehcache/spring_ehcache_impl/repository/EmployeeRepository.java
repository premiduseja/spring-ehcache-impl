package com.codeforfun.ehcache.spring_ehcache_impl.repository;

import com.codeforfun.ehcache.spring_ehcache_impl.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    Employee getByFirstName(String firstName);
}