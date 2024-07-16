package com.airlinerreservationsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservId;
	
	private String name;
	
	private int age;
	
	private String address;
	
	private String email;
	
	private long contact;
	
	private double amount;
	
	private String  date;
	
	private String arrivalTime;
	
	private String departureTime;
	
	private String origin;
	
	private String destination;

	public int getReservId() {
		return reservId;
	}

	public void setReservId(int reservId) {
		this.reservId = reservId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
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

	public Reservation(int reservId, String name, int age, String address, String email, long contact, double amount,
			String date, String arrivalTime, String departureTime, String origin, String destination) {
		super();
		this.reservId = reservId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.contact = contact;
		this.amount = amount;
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.origin = origin;
		this.destination = destination;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Reservation [reservId=" + reservId + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", email=" + email + ", contact=" + contact + ", amount=" + amount + ", date=" + date
				+ ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", origin=" + origin
				+ ", destination=" + destination + "]";
	}
	
	

}
