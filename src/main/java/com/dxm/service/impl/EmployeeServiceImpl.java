package com.dxm.service.impl;

import com.dxm.dao.EmployeeDao;
import com.dxm.entity.Employee;
import com.dxm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> queryAllEmployee() {
        // TODO Auto-generated method stub
        return employeeDao.queryAll();
    }

    @Override
    public void addEmp(Employee... emps) {
        // TODO Auto-generated method stub

        employeeDao.add(emps);
    }


    @Override
    public Employee queryEmpById(Integer id) {
        // TODO Auto-generated method stub
        return employeeDao.queryById(id);
    }


    @Override
    public void updateEmp(Employee employee) {
        // TODO Auto-generated method stub
        employeeDao.update(employee);
    }


    @Override
    public void deleteEmpById(Integer id) {
        // TODO Auto-generated method stub
        employeeDao.delete(id);
    }

}
