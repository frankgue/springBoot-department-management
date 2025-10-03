package com.gkfcsolution.springbootdepartmentmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * Created on 2025 at 15:51
 * File: null.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 15:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(unique = true)
    @NotBlank(message = "Please add Department Name")
    private String departmentName;
    private String departmentAddress;
    @Column(unique = true)
    private String departmentCode;
}
