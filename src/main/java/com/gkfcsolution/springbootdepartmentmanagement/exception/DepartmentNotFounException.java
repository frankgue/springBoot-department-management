package com.gkfcsolution.springbootdepartmentmanagement.exception;

/**
 * Created on 2025 at 18:18
 * File: null.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 18:18
 */
public class DepartmentNotFounException extends Exception{
    public DepartmentNotFounException() {
        super();
    }

    public DepartmentNotFounException(String message) {
        super(message);
    }

    public DepartmentNotFounException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFounException(Throwable cause) {
        super(cause);
    }

    protected DepartmentNotFounException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
