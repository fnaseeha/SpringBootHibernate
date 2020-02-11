package lk.naseeha.DemoDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.naseeha.DemoDb.Repository.EmployeeRepository;
import lk.naseeha.DemoDb.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeerepository;

	@Override
	public Employee save(Employee employee) {
		 employeerepository.save(employee);
		 return employee;
	}
	
	

}
