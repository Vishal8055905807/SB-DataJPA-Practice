package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

public UserDaoImpl() {
	System.out.println("UserDao constructor");
}

public String getNameById(int id) {
	if(id == 100) {
		return "Vishal";
	}else {
		return "Nitin";
	}

}

}

