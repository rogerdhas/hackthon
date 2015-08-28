package com.prediction;

public class DataCleaner {

	public static CustData  SetInfo(String data)
	{
		if(data == null) return null;
		return new CustData(data);
	}
}
