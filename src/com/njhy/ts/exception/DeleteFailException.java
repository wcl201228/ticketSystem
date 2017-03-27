package com.njhy.ts.exception;

/**
 * 删除失败异常
 * �? �? �?: DeleteFailException.java
 * �? �?: Copyright 2014-, All rights reserved
 * �? �?: <描述>
 * �? �? �?:崔译   cuiyi@itany.com
 * 创建时间: 2014-2-25 下午2:44:06
 * 版本：V1.0.0
 */
public class DeleteFailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DeleteFailException() {
		super();
	}

	public DeleteFailException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeleteFailException(String message) {
		super(message);
	}

	public DeleteFailException(Throwable cause) {
		super(cause);
	}

}
