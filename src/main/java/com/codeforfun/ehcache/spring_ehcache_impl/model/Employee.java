package com.codeforfun.ehcache.spring_ehcache_impl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Entity(name = "t_employee")
public class Employee implements Serializable {

    @Id
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "date_of_joining")
    private Date dateOfJoining;
    @Column(name = "date_of_termination")
    private Date dateOfTermination;


}
