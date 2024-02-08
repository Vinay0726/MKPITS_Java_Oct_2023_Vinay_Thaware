package com.mkpits.methods;

public class GetterSetter {

	public String name;
	public String email;
	public long mobile;
	
	public void setMyName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
}
