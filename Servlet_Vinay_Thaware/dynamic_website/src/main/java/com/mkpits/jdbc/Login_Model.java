package com.mkpits.jdbc;

public class Login_Model {
	private int id;
	private String name;
	private String email;
	private String gender;
	private String city;
	private long mobile;
	private String uname;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login_Model(int id, String name, String email, String gender, String city, long mobile, String uname,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
		this.uname = uname;
		this.password = password;
	}
	public Login_Model(String name, String email, String gender, String city, long mobile, String uname,
			String password) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
		this.uname = uname;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login_Model [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", city=" + city
				+ ", mobile=" + mobile + ", uname=" + uname + ", password=" + password + "]";
	}
	
	
}
