package com.workout.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(){
        super();
    }

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
