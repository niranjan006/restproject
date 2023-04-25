package com.example.scrap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ScrapClass {
	@Id
	private int scrapid;
	private String name;
	private String dept;
	private String email;
	ScrapClass(){}
	public int getScrapid() {
		return scrapid;
	}
	public void setScrapid(int scrapid) {
		this.scrapid = scrapid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ScrapClass(int scrapid, String name, String dept, String email) {
		super();
		this.scrapid = scrapid;
		this.name = name;
		this.dept = dept;
		this.email = email;
	}
	
}
