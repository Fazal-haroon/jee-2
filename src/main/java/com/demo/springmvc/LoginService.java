package com.demo.springmvc;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("fazal") && password.equals("pass");
	}

}