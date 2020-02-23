package com.dxm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dxm.entity.Employee;
import com.dxm.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/emps")
	public String list(Model model) {
		List<Employee>employees=employeeService.queryAllEmployee();
		model.addAttribute("list",employees);
		return "emp/list";
	}
	
	@GetMapping("/emp")
	public String toAddEmp() {
		return "emp/add";
	}
	
	@PostMapping("/emp")
	public String addEmp(String name,Integer sex,Integer age,Integer sales) {
		Employee emp=new Employee(name,sex,age,sales);
		employeeService.addEmp(emp);
		return "redirect:emps";
	}
	
	@GetMapping("/emp/{id}")
	public String toEdiEmp(@PathVariable("id") Integer id,Model model) {
		Employee employee = employeeService.queryEmpById(id);
		model.addAttribute("emp",employee);
		return "emp/add";
	}
	
	@PutMapping("/emp")
	public String updateEmp(Employee employee) {
		employeeService.updateEmp(employee);
		return "redirect:/emps";
	}
	
	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable("id") Integer id) {
		employeeService.deleteEmpById(id);
		return "redirect:/emps";
	}
	
}
