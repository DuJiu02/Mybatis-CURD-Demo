package com.hr.entity;

public class Users {
	private Integer uid;
	private String uname;
	private Integer age;
	private String sex;
	private Integer usid;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", age=" + age + ", sex=" + sex + ", usid=" + usid + "]\n";
	}
	
	
}
