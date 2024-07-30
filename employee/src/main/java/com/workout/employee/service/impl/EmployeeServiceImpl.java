package com.workout.employee.service.impl;

import com.workout.employee.entity.Employee;
import com.workout.employee.repository.EmployeeRepository;
import com.workout.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void create(Employee employee) {
        log.info("Entered into Employee service create method");

        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() throws Exception {
        log.info("Entered into Employee service get all method");
        List<Employee> employeeList = employeeRepository.findAll();
        if (employeeList.size() == 0){
            throw new Exception("No Employees Found");
        }
        return employeeList;
    }
}
