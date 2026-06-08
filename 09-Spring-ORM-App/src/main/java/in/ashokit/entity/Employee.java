package in.ashokit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity     // mandatory annotation                  
@Table(name = "employee_data")  // optional annotation.If not given table name is set same as class name
public class Employee {

	@Id   // mandatory annotation
	@Column(name = "employee_id")   // optional annotation. If not given column name is set same as variable name
	private int employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_salary")
	private Double employeeSalaray;
	

}


//## Entity Class : The java class which is mapped with Database Table.
//Java class name ------------> Table name
//class variables -----------> table column names
//class object   -----------> Table row