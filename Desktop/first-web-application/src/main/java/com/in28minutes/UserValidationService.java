package com.in28minutes;
public class UserValidationService {
	public boolean isUserValid(String user, String password){
		if (user.equals("naiyou")&& password.equals("me")) 
			return true;
		return false;
	}

}
