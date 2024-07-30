package com.workout.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name= "employee_details")
public class Employee {

    @Column (name="employee_name")
    private String name;

    @Id
    private String id;

    @Column (name= "salary")
    private int salary;

    @Column (name= "designation")
    private String designation;


}
