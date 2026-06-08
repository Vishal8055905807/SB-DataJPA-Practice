package in.ashokit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;

@Repository
@Transactional
//@Transactional annotation uses:
//1. Start transaction
//2. Execute method
//3. If success → COMMIT
//4. If exception → ROLLBACK
// Since we are executing queries here with hibernateTemplate.save() we need this annotation here



public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void saveEmployee(Employee e) {
		hibernateTemplate.save(e);   //dialect will convert in HQL
	} 
	
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = hibernateTemplate.loadAll(Employee.class);
		return employeeList;
	}
	
	public Employee getEmployeeById(Integer id) {
		Employee employee = hibernateTemplate.get(Employee.class, id); //Takes second argument as Serializable . All Java Wrapper classes implement the Serializable interface.
		return employee;
	}
	
	public void saveOrUpdateEmployee(Employee e) {
		hibernateTemplate.saveOrUpdate(e);
	}
	
	
}
