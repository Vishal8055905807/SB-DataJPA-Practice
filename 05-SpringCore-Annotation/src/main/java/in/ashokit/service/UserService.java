package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDaoImpl;

@Service
public class UserService {
	
public UserService() {
	System.out.println("UserService Constructor - 0 param");
}	

//3 ways to perform dependency injection

// 1] Field Injection

//@Autowired	
//UserDao userdao;	


//2] Constructor Injection 

//UserDao userdao;
//
//@Autowired
//public UserService(UserDao userdao) {
//	this.userdao = userdao;
//	System.out.println("UserService Constructor - param");
//}	
	
//Note: When target bean having only one parameterized constructor then @Autowired is optional at 
//constructor level.

// 3] Setter Injection	

UserDaoImpl userdao;

@Autowired
public void setUserdao(UserDaoImpl userdao) {
	System.out.println("Setter method working..");
	this.userdao = userdao;
}




public void printName() {
	String nameById = userdao.getNameById(100);
	System.out.println(nameById);

}

}
