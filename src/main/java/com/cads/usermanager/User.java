package com.cads.usermanager;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import lombok.Data;

@Data
@Entity
public class User {
	private @Id @GeneratedValue long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public User() {}
	
	public User(String fname, String lname, String phone, String email) {
		this.firstName = fname;
		this.lastName = lname;
		this.phoneNumber = phone;
		this.email = email;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
