package com.chainsys.springmvc.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doctor {
	@Id
	private  int doctor_id; 
	private String name;    
	private Date dob;                         
	private String speciality; 
	private String city;                   
	private long phone_No;        
	private float standard_fees; 
	
	
	public int getDoctor_id() {
		return doctor_id;
	}


	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhone_No() {
		return phone_No;
	}


	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}


	public float getStandard_fees() {
		return standard_fees;
	}


	public void setStandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}


	 
	
	
	@Override
	public String toString() // Default method
	{
		return String.format("%d, %s, %s, %s, %d, %d",doctor_id,name,dob,speciality,city,phone_No,standard_fees);
	}
}
