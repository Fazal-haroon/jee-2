package com.demo.springmvc;

import org.springframework.stereotype.Service;

//new LoginService()
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("fazal") && password.equals("pass");
	}

}