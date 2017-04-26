package com.yibao.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yibao.schedule.service.UserService;

@RestController
@Controller
public class LoginController {
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping("/user/login")
	public String login(String userName) {
		return userService.getUser(userName);
	}
}
