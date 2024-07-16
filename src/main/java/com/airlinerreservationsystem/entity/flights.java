package com.airlinerreservationsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "flights")
public class flights {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int f_id;
	
	@Column (name = "date")
	private String date;
	
	@Column (name = "d_time")
	private String d_time;

	@Column (name = "a_time")
	private String a_time;
	
	@Column (name = "origin")
	private String origin;
	
	@Column (name = "destination")
	private String destination;
	
	@Column (name = "country")
	private String country;
	
	@Column (name = "seats")
	private int seats;

	public flights()
	{
		
	}
	
	public flights(int f_id, String date, String d_time, String a_time, String origin, String destination,
			String country, int seats) {
		super();
		this.f_id = f_id;
		this.date = date;
		this.d_time = d_time;
		this.a_time = a_time;
		this.origin = origin;
		this.destination = destination;
		this.country = country;
		this.seats = seats;
	}
	
	
	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getD_time() {
		return d_time;
	}

	public void setD_time(String d_time) {
		this.d_time = d_time;
	}

	public String getA_time() {
		return a_time;
	}

	public void setA_time(String a_time) {
		this.a_time = a_time;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "flights [f_id=" + f_id + ", date=" + date + ", d_time=" + d_time + ", a_time=" + a_time + ", origin="
				+ origin + ", destination=" + destination + ", country=" + country + ", seats=" + seats + "]";
	}

	
	
	
	
}
