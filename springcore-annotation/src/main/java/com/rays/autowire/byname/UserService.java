package com.rays.autowire.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("byNamee")
public class UserService {
	
	@Autowired
	@Qualifier("byName")
	private UserDaoInterface userDao;
	
	public void add() {
		userDao.add();
	}

}
