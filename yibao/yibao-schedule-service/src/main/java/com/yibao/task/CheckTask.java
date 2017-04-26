package com.yibao.task;

import org.springframework.stereotype.Component;

@Component("checkTask")
public class CheckTask {
	
	public void run() {
		System.err.println("test");
	}
}
