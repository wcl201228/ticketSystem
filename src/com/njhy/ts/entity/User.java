package com.njhy.ts.entity;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String uname;
	private String upass;
	private String utype;
	private String tname;
	private String sex;
	private String age;
	private String tel;
	private String addrs;
	private String filename;
	private String qq;
	private String bei;
	private String savetime;
	private String idcard;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getBei() {
		return bei;
	}
	public void setBei(String bei) {
		this.bei = bei;
	}
	public String getSavetime() {
		return savetime;
	}
	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
	public User() {
	
		super();
	}
	public User(Integer id, String uname, String upass, String utype, String tname, String sex, String age, String tel,
			String addrs, String filename, String qq, String bei, String savetime, String idcard) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.utype = utype;
		this.tname = tname;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.addrs = addrs;
		this.filename = filename;
		this.qq = qq;
		this.bei = bei;
		this.savetime = savetime;
		this.idcard = idcard;
	}

	

}
