package com.gkfcsolution.springbootdepartmentmanagement.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * Created on 2025 at 18:28
 * File: ErrorMessage.java.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 18:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorMessage {
    private HttpStatus status;
    private String message;
}
