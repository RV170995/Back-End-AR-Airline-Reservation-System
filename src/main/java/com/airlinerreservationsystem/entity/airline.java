package com.airlinerreservationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airlines")
public class airline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;
	
	@Column(name= "a_name")
	private String a_name;
	
	@Column(name= "contact")
	private Long contact;
	
	@Column(name= "region")
	private String region;

	airline()
	{
		
	}

	public airline(int a_id, String a_name, Long contact, String region) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.contact = contact;
		this.region = region;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "airline [a_id=" + a_id + ", a_name=" + a_name + ", contact=" + contact + ", region=" + region + "]";
	}
	
	
}
