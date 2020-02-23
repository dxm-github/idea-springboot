package com.dxm.service;

import com.dxm.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> queryAllEmployee();

    void addEmp(Employee...emps);

    Employee queryEmpById(Integer id);

    void updateEmp(Employee employee);

    void deleteEmpById(Integer id);


}
