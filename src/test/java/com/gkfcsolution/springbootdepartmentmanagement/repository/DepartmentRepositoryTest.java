package com.gkfcsolution.springbootdepartmentmanagement.repository;

import com.gkfcsolution.springbootdepartmentmanagement.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created on 2025 at 21:26
 * File: JUnit5 Test Class.java.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 21:26
 */
@DataJpaTest
//@SpringBootTest
@ActiveProfiles("test")
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("Mechanical Engineering")
                .departmentCode("ME - 011")
                .departmentAddress("Douala")
                .build();

        entityManager.persist(department);
    }

    @Test
    @Disabled
    public void WhenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findById(1L).get();

        assertEquals(department.getDepartmentName(), "Genie Logiciel");
//        assertEquals(department.getDepartmentName(), "Mechanical Engineering");
    }
}