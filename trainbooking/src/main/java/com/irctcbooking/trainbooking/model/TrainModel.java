package com.irctcbooking.trainbooking.model;

public class TrainModel {

	int trainnumber;
	String fromlocation;
	String tolocation;
	String bookingdate;
	String bookingclasses;
	String trainname;
	
	
	public TrainModel(int trainnumber, String fromlocation, String tolocation, String bookingdate, String bookingclasses,
			String trainname) {
		super();
		this.trainnumber = trainnumber;
		this.fromlocation = fromlocation;
		this.tolocation = tolocation;
		this.bookingdate = bookingdate;
		this.bookingclasses = bookingclasses;
		this.trainname = trainname;
	}
	public int getTrainnumber() {
		return trainnumber;
	}
	public void setTrainnumber(int trainnumber) {
		this.trainnumber = trainnumber;
	}
	public String getFromlocation() {
		return fromlocation;
	}
	public void setFromlocation(String fromlocation) {
		this.fromlocation = fromlocation;
	}
	public String getTolocation() {
		return tolocation;
	}
	public void setTolocation(String tolocation) {
		this.tolocation = tolocation;
	}
	
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getBookingclasses() {
		return bookingclasses;
	}
	public void setBookingclasses(String bookingclasses) {
		this.bookingclasses = bookingclasses;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	
	
}
