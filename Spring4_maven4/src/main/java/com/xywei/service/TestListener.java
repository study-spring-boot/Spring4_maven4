package com.xywei.service;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听
 * 
 * @author wodoo
 *
 */
@Component
public class TestListener implements ApplicationListener<TestEvent> {

	public void onApplicationEvent(TestEvent event) {
		String msString = event.getMessage();

		System.out.println("监听器接收到事件----" + msString);
	}

}
