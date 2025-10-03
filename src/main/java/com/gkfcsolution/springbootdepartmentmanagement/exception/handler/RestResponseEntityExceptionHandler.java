package com.gkfcsolution.springbootdepartmentmanagement.exception.handler;

import com.gkfcsolution.springbootdepartmentmanagement.entity.dto.ErrorMessage;
import com.gkfcsolution.springbootdepartmentmanagement.exception.DepartmentNotFounException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created on 2025 at 18:24
 * File: null.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 18:24
 */
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFounException.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFounException exception,
                                                                    WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}
