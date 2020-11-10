package com.simhadri.service.impl;

import org.springframework.stereotype.Service;

import com.simhadri.service.LoginService;
import com.simhadri.vo.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean validateUser(User user) {		
		return user.getUserName().equals("Appanna") && user.getPassword().equals("Appanna123");
	}
}
