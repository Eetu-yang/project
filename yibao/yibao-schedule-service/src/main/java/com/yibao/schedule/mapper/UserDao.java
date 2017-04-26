package com.yibao.schedule.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
	public HashMap<String, Object> findUserByUserName(@Param(value = "userName") String userName);
}
