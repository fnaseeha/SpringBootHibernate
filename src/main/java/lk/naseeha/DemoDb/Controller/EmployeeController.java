package lk.naseeha.DemoDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lk.naseeha.DemoDb.model.Employee;
import lk.naseeha.DemoDb.service.EmployeeServiceImp;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImp employeeServiceImp;
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public Employee saveEmployee(Employee employee){
		return employeeServiceImp.save(employee);
	}
	

	
}
