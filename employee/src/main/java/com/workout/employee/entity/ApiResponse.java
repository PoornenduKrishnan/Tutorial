package com.workout.employee.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Setter;

import java.util.List;
@Data
@JsonInclude
public class ApiResponse {
    private String message;
    private List<Employee> employeeList;
}
