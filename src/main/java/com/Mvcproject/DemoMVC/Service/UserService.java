package com.Mvcproject.DemoMVC.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mvcproject.DemoMVC.dao.UserDao;
import com.Mvcproject.DemoMVC.entity.User;

@Service
public class UserService {
     @Autowired
	UserDao dao;
	public String  checkUser(User user) {
		
		String msg =null;
		User u =dao.checkUser(user);
		if(Objects.isNull(msg)){
			 msg="Invalid User";
		}else {
			msg="Valid user";
		}
		return msg;
	
	}

}
