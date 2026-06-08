package in.ashokit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ashokit.dto.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		System.out.println("mapRow() method called"); //this method is called as many times as rows in table
		
		Student s = new Student();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("sname"));
		s.setCity(rs.getString("city"));
		
		
		return s;
	}

}
