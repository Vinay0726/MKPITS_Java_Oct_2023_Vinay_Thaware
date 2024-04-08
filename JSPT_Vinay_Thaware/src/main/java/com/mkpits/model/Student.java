package com.mkpits.model;

public class Student {
 public String firstName;
 public String lastName;
 public boolean isgoIdCustomer;
public Student(String firstName, String lastName, boolean isgoIdCustomer) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.isgoIdCustomer = isgoIdCustomer;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public boolean isIsgoIdCustomer() {
	return isgoIdCustomer;
}
public void setIsgoIdCustomer(boolean isgoIdCustomer) {
	this.isgoIdCustomer = isgoIdCustomer;
}

}
