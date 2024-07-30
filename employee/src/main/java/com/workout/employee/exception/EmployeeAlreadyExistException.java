package com.workout.employee.exception;


public class EmployeeAlreadyExistException extends RuntimeException{
    public EmployeeAlreadyExistException() {
        super();
    }
    public EmployeeAlreadyExistException(String message) {
        super(message);
    }
}
