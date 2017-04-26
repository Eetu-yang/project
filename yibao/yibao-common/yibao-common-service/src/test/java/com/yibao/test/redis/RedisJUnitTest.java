package com.yibao.test.redis;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yibao.common.api.redis.IRedisService;
import com.yibao.common.application.Application;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class RedisJUnitTest {
	@Resource(name="redisService")
	private IRedisService redisService;
	
	@Test
	public void set(){
		redisService.set("haha", "呵呵");
	}
	
	
	@Test
	public void get(){
		String ye = redisService.get("haha");
		System.out.println(ye);
	}
	
	
}
