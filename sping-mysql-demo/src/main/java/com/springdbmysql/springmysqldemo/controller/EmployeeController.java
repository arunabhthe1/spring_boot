package com.springdbmysql.springmysqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springdbmysql.springmysqldemo.dao.EmployeeRepository;
import com.springdbmysql.springmysqldemo.model.Employee;

@RestController
@RequestMapping("/employeeapp")
public class EmployeeController {
	public EmployeeController(){
		System.out.println("This is the EmployeeController");
	}
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	// This is same as above 
	//@GetMapping(value="/getAll")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	//@RequestMapping(value="/saveEmp", method=RequestMethod.POST)
	// The above is same as @PostMapping
	@PostMapping(value="/employees")
	public Employee saveEmployee(@RequestBody Employee emp){
		System.out.println(emp);
		return employeeRepository.save(emp);
	}
	
	@GetMapping(value="/employees/{empName}")
	public Employee getEmployeeByName(@PathVariable String empName){
		return employeeRepository.findByEmpName(empName);
	}
	
	@PutMapping(value="/employees")
	public Employee updateEmployee(@RequestBody Employee emp){
		System.out.println(emp);
		return employeeRepository.save(emp);
	}
	
	@DeleteMapping(value="/employees/{empid}")
	public void deleteEmployee(@PathVariable String empid){
		
		employeeRepository.deleteById(Long.parseLong(empid));
	}
}
