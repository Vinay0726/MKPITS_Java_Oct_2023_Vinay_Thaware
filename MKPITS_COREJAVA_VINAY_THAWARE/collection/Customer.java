package com.mkpits.collection;

import java.util.Objects;

public class Customer {
//Model Class
//1)Variable
	private String name;
	private int id;
	private String city;
	
//2)Create Constructor
	public Customer(String name, int id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}
//3)Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
//4)ToString
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
////5)HashCode Equals
	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}

	
	
	
	
}
