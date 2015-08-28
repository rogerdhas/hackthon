package com.prediction;

public class PredictInfo {

	String state="";
	String gender="";
	Integer age=0;
	Integer pos=0;
	Integer neg=0;
	public PredictInfo(String state,String gender,Integer age) {
		this.state = state;
		this.age = age;
		this.gender=gender;
	
	}
	
}
