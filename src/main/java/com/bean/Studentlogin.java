package com.bean;

public class Studentlogin {
	private Integer id;
	private String email;
	private String password;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

}
