package com.tap.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empid")
	int empid;
	
	@Column(name="fname")
	String fname;
	
	@Column(name="lname")
	String lname;
	
	@Column(name="email")
	String email;
	
	@Column(name="role")
	String role;
	
	@Column(name="department")
	String department;

	
	
	
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

	@Autowired
	public Employee(@Value("1") int empid, 
			@Value("CHANDAN") String fname, 
			@Value("kj") String lname,
			@Value("cha@gmail.com") String email, 
			@Value("Developer") String role, 
			@Value("ISE") String department) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.role = role;
		this.department = department;
	}
	


	
	
	
	
	
}
