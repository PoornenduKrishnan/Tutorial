package com.workout.employee.controller;

import com.workout.employee.entity.ApiResponse;
import com.workout.employee.entity.Employee;
import com.workout.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public void createEmployee(@RequestBody Employee employee){
        employeeService.create(employee);
    }
    @GetMapping("/get")
    public  ResponseEntity<ApiResponse> getAllEmployee() {

        ApiResponse apiResponse = new ApiResponse();
        try {
            apiResponse.setEmployeeList(employeeService.getAllEmployee());
            return new ResponseEntity<>(apiResponse, HttpStatus.OK);
        } catch (Exception e) {
           apiResponse.setMessage(e.getMessage());
            return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


}
