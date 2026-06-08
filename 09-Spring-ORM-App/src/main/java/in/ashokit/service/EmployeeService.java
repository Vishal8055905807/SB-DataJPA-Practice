package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.EmployeeDao;
import in.ashokit.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empDao;
	
	public void saveEmp(Employee e) {
		empDao.saveEmployee(e);
	}
	
	public List<Employee> getAllEmployess() {
		List<Employee> allEmployees = empDao.getAllEmployees();
		return allEmployees;
	}

	public Employee getEmployeeById(Integer id) {
		Employee employeeById = empDao.getEmployeeById(id);
		return employeeById;
	}
	
	public void saveOrUpdateEmployee(Employee e) {
		empDao.saveOrUpdateEmployee(e);
	}
	
}
