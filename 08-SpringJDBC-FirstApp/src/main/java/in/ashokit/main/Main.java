package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import org.springframework.context.ApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.dao.StudentDao;
import in.ashokit.dto.Student;

public class Main {
	
	//REFER SRING-JDBC-ARCHITECTURE SCREENSHOT 

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao dao = ctxt.getBean(StudentDao.class);
		
		
//		Student s = new Student();
//		s.setId(103);
//		s.setName("Digvijay");
//		s.setCity("Pune");
//		
//		int count = dao.save(s);
//		
//		System.out.println("Rows affected::" + count);
		
		
		List<Student> studentList = dao.findAll();
		studentList.forEach(System.out::println);

		
		
	}

}
