package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		List tagList = new ArrayList();
		tagList.add("hmysql");
		tagList.add("java");
		tagList.add("hmysql");
		tagList.add("java");
		tagList.add("hmysql");
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com", "67", "100", tagList, "How does HashMap works?","90"));
		employeesList.add(new Employee(2,"lokesh","gupta","howtodoinjava@gmail.com", "67", "100", tagList, "How does HashMap works?","90"));
		employeesList.add(new Employee(3,"lokesh","gupta","howtodoinjava@gmail.com", "67", "100", tagList, "How does HashMap works?","67"));		
		return employeesList;
    }

}
