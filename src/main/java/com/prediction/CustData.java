package com.prediction;

public class CustData {
	
	String name;
	String gender;
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public CustData(String data) {
		
		 String[] f= data.split("\\|");
		 userId = f[0];
		 name=f[1];
		 age=Integer.parseInt(f[3]);
		 state=f[2];
		 gender=f[4];
		 planName = f[5];
		 planUsage= Double.parseDouble(f[6]);
		 actualUsage= Double.parseDouble(f[8]);
		 price= Double.parseDouble(f[7]);
		 
		 
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public double getPlanUsage() {
		return planUsage;
	}
	public void setPlanUsage(double planUsage) {
		this.planUsage = planUsage;
	}
	public double getActualUsage() {
		return actualUsage/1024;
	}
	public void setActualUsage(double actualUsage) {
		this.actualUsage = actualUsage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	Integer age;
	String state;
	String userId;
	String planName;
	double planUsage;
	double actualUsage;
	double price;
	

}
