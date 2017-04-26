package com.server.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com")
@MapperScan("com.yibao.sso.mapper")
public class Appliction extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Appliction.class, args);
	}

}
