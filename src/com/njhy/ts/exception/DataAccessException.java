package com.njhy.ts.exception;

/**
 * 
 * �? �? �?: DataAccessException.java
 * �? �?: Copyright 2014-, All rights reserved
 * �? �?: <描述>
 * �? �? �?:崔译   cuiyi@itany.com
 * 创建时间: 2014-2-14 上午11:31:05
 * 版本：V1.0.0
 */
public class DataAccessException extends RuntimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public DataAccessException() {
		super();
	}

	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataAccessException(String message) {
		super(message);
	}

	public DataAccessException(Throwable cause) {
		super(cause);
	}
}
