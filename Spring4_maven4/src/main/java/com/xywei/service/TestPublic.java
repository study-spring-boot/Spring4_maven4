package com.xywei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 发布
 * 
 * @author wodoo
 *
 */
@Service
public class TestPublic {
	@Autowired
	private ApplicationContext applicationContext;

	public void publisher(String messge) {
		String msg = messge;
		applicationContext.publishEvent(new TestEvent(this, msg));
	}

}
