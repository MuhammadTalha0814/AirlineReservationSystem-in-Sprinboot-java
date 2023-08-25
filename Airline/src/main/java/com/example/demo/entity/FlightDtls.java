package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "flight_dtls")
public class FlightDtls {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String departure;
	private String destination;
	private String dob;
	
	FlightDtls()
	{
		
	}

	public FlightDtls(Integer id, String departure, String destination, String dob) {
		super();
		this.id = id;
		this.departure = departure;
		this.destination = destination;
		this.dob = dob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "FlightDtls [id=" + id + ", departure=" + departure + ", destination=" + destination + ", dob=" + dob
				+ "]";
	}
	
	
	
}
