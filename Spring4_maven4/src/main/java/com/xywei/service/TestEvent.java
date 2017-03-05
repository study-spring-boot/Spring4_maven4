package com.xywei.service;

import org.springframework.context.ApplicationEvent;

/**
 * 事件
 * 
 * @author wodoo
 *
 */
public class TestEvent extends ApplicationEvent {

	private static final long serialVersionUID = 3042753812955674599L;

	private String message;

	public TestEvent(Object source, String msg) {

		super(source);
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
