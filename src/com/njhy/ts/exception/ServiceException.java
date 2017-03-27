package com.njhy.ts.exception;

/**
 * 服务异常
 * �? �? �?: ServiceException.java
 * �? �?: Copyright 2014-, All rights reserved
 * �? �?: <描述>
 * �? �? �?:崔译   cuiyi@itany.com
 * 创建时间: 2014-2-17 上午11:55:45
 * 版本：V1.0.0
 */
public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
	
	

}
