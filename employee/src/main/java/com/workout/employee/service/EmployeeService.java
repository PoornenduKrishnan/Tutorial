package com.workout.employee.service;

import com.workout.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void create(Employee employee);

    List<Employee> getAllEmployee() throws Exception;
}
