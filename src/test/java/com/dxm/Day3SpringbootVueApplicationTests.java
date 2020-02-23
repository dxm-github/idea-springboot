package com.dxm;

import com.dxm.dao.EmployeeDao;
import com.dxm.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Day3SpringbootVueApplicationTests {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void contextLoads() {
        List<Employee> list=employeeDao.queryAll();
        System.out.println(list);
    }

}
