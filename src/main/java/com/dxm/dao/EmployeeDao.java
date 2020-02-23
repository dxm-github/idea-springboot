package com.dxm.dao;

import com.dxm.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDao {

	List<Employee> queryAll();

	void add(Employee[] emps);

	Employee queryById(Integer id);

	void update(Employee employee);

	void delete(Integer id);

}
