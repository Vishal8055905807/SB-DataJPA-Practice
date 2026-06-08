package in.ashokit.dao;


import java.util.List;
import in.ashokit.mapper.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ashokit.dto.Student;

@Repository
public class StudentDao {

private JdbcTemplate jt;


// no need to provide @Autowired annotation because only one parameterized constructor
public StudentDao(JdbcTemplate jt) {
	this.jt = jt;
}


public int save(Student s) {
	String sql = "INSERT INTO learner (id, sname , city) VALUES (?,?,?)";
	int rowsAffected = jt.update(sql, s.getId(), s.getName(), s.getCity());  // JdbcTemplate handles all JDBC boilerplate code
	return rowsAffected;
	
}


public List<Student> findAll(){
	
	String sql = "SELECT * FROM learner";
	List<Student> studentList = jt.query(sql, new StudentMapper());
	return studentList;

	

}



}
