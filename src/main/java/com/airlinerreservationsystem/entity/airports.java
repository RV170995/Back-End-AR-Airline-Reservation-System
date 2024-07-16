package com.airlinerreservationsystem.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airports")
public class airports {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int airport_code;
	@Column (name = "airport_name")
	private String airport_name;
	@Column (name = "location")
	private String location;
	
	public airports()
	{
		
	}
	
	
	
	public airports(String airport_name, String location) {
		super();
		this.airport_name = airport_name;
		this.location = location;
	}



	public int getAirport_code() {
		return airport_code;
	}
	public void setAirport_code(int airport_code) {
		this.airport_code = airport_code;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "airports [airport_code=" + airport_code + ", airport_name=" + airport_name + ", location=" + location
				+ "]";
	}

}
