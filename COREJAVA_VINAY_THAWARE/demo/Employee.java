package com.mkpits.demo;

public class Employee {
  int id;
  String name;
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
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
   
}
