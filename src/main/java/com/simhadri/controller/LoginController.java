package com.simhadri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simhadri.service.LoginService;
import com.simhadri.vo.APIResponse;
import com.simhadri.vo.User;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping(value = "/validate")
	public APIResponse validateUser(@RequestBody User user) {
		
		boolean flag=loginService.validateUser(user);
		
		return new APIResponse("validate User", HttpStatus.OK.value(), flag);
		
	}
	

}
