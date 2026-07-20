package com.rays.autowire.byname;

import org.springframework.stereotype.Component;

@Component("byName")
public class UserDaoImpl implements UserDaoInterface  {

	public void add() {
		System.out.println("Inside Add method...");		
	}
	
	

}
