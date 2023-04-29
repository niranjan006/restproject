package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
       @Id
       private int id;
       private String name;
       private String email;
       private String phno;
       private String dob;
       private String parentnum;
       private String address;
      private String aadharcardnum;
       private String bloodgrp;
       private String religion;
       College(){}
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
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getParentnum() {
		return parentnum;
	}
	public void setParentnum(String parentnum) {
		this.parentnum = parentnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharcardnum() {
		return aadharcardnum;
	}
	public void setAadharcardnum(String aadharcardnum) {
		this.aadharcardnum = aadharcardnum;
	}
	public String getBloodgrp() {
		return bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public College(int id, String name, String email, String phno, String dob, String parentnum, String address,
			String aadharcardnum, String bloodgrp, String religion) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.dob = dob;
		this.parentnum = parentnum;
		this.address = address;
		this.aadharcardnum = aadharcardnum;
		this.bloodgrp = bloodgrp;
		this.religion = religion;
	}
	
}
