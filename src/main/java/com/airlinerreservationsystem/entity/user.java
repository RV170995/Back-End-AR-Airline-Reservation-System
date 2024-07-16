package com.airlinerreservationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int u_id;
	@Column
	private String f_name;
	@Column
	private String l_name;
	@Column
	private long mob_no;
	@Column
	private String address;
	@Column
	private String emailId;
	@Column
	private String Password;
	
	
	user()
	{
		
	}


	public user(int u_id, String f_name, String l_name, long mob_no, String address, String emailId, String password) {
		super();
		this.u_id = u_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.mob_no = mob_no;
		this.address = address;
		this.emailId = emailId;
		Password = password;
	}


	public int getU_id() {
		return u_id;
	}


	public void setU_id(int u_id) {
		this.u_id = u_id;
	}


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public long getMob_no() {
		return mob_no;
	}


	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "user [u_id=" + u_id + ", f_name=" + f_name + ", l_name=" + l_name + ", mob_no=" + mob_no + ", address="
				+ address + ", emailId=" + emailId + ", Password=" + Password + "]";
	}
	
}
