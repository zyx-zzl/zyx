package com.zyx.bean;

public class User {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private Integer age;
	private String zyx;
	private double height;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesc() {
		return zyx;
	}
	public void setDesc(String desc) {
		this.zyx = zyx;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", age="
				+ age + ", desc=" + zyx + ", height=" + height + "]";
	}
	
	
	
	
	

}
