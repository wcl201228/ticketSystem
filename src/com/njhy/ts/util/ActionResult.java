package com.njhy.ts.util;

import java.io.Serializable;

/**
 * 请求结果，封装了请求的执行结果
 * 文 件 名: ActionResult.java
 * 版 权: Copyright 2014-, All rights reserved
 * 描 述: <描述>
 * 创 建 人:崔译   cuiyi@itany.com
 * 创建时间: 2014-2-17 上午11:12:12
 * 版本：V1.0.0
 */
public class ActionResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean success;
	
	private String msg;
	
	private Object data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public ActionResult() {
	}

	public ActionResult(Object data) {
		this.success = true;
		this.msg = "";
		this.data = data;
	}
	
	
}
