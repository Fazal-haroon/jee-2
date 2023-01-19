package com.demo.jee;

public class UserValidationService {
    public boolean isUserValid(String user, String password){
        if (user.equals("fazal") && password.equals("pass")) {
            return true;
        }
        return false;
    }
}
