package com.airlinerreservationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Registration")
public class registrations /* implements UserDetails */{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reg_id;
	
	@Column (name = "f_name")
	private String f_name;
	
	@Column (name = "l_name")
	private String l_name;
	
	@Column (name = "mob_no")
	private int mob_no;
	
	@Column (name = "address")
	private String address;
	
	@Column (name = "emailId")
	private String emailID;
	
	@Column (name ="pswd")
	private String pswd;
	
	private String role;
	
	registrations()
	{
		
	}
	public registrations(int reg_id, String f_name, String l_name, int mob_no, String address, String emailID,
			String pswd,String  role) {
		super();
		this.reg_id = reg_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.mob_no = mob_no;
		this.address = address;
		this.emailID = emailID;
		this.pswd = pswd;
		this.role = role;
	}



	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
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

	public int getMob_no() {
		return mob_no;
	}

	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Registration [reg_id=" + reg_id + ", f_name=" + f_name + ", l_name=" + l_name + ", mob_no=" + mob_no
				+ ", address=" + address + ", emailID=" + emailID + ", pswd=" + pswd + ", role=" + role +"]";
	}
	
	/*
	 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
	 * List<SimpleGrantedAuthority> authorities = new
	 * ArrayList<SimpleGrantedAuthority>(); authorities.add(new
	 * SimpleGrantedAuthority(this.role)); return authorities; }
	 * 
	 * @Override public String getUsername() { return this.emailID; }
	 * 
	 * @Override public String getPassword() { return this.pswd; }
	 */
	
	
}
