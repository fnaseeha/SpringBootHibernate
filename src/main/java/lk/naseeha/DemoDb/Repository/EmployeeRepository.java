package lk.naseeha.DemoDb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.naseeha.DemoDb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
