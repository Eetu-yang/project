package com.yibao.schedule.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yibao.schedule.mapper.UserDao;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;

	public String getUser(String userName) {
		HashMap<String, Object> result = userDao.findUserByUserName(userName);
		return (String) result.get("relName");
	}
}
