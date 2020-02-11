package lk.naseeha.DemoDb.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.naseeha.DemoDb.model.Employee;

public interface EmployeeService{
	public Employee save(Employee employee);

}
