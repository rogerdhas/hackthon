package com.prediction;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Loader {
	
	public static Map<String,Integer> age = new HashMap<String,Integer>();
	public  static Map<String,Integer> state = new HashMap<String,Integer>();
	public  static int maleCount = 0;
	public  static int femaleCount = 0;
	public static int totalCustCount = 0;

	public static void analyse(String planName, Double newUsage, Double newPrice) {
		// TODO Auto-generated method stub
		//String planName = "Small";
		//Double newUsage = 1.5; //1,3,6,12 
		//Double newPrice = 35.0;
		Double currentPrice = 80.0;
		Double maxPrice = 200.0; //30,45,60,80
		Double factor = 0.15;
		Double cUsage = 12288.0;
		if(planName.indexOf("Small") != -1 )
		{
			currentPrice = 30.0;
			maxPrice = 45.0; //30,45,60,80
			factor = 0.033;
			cUsage = 1024.0;
		}
		else if(planName.indexOf("Medium") != -1 )
		{
			currentPrice = 45.0;
			maxPrice = 60.0; //30,45,60,80
			factor = 0.066;
			cUsage = 3072.0;
		}
		else if(planName.indexOf("Large") != -1 )
		{
			currentPrice = 60.0;
			maxPrice = 80.0; //30,45,60,80
			factor = 0.1;
			cUsage = 6144.0;
		}
		
		
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream("sample.csv");
			//Scanner scanner = new Scanner(new File("sample.csv"));
			Scanner scanner = new Scanner(is);
			scanner.hasNextLine();
			List<CustData> customerInfos = new ArrayList<CustData>();
			while(scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            if(line.indexOf(planName) == -1 ) continue;
	            customerInfos.add(DataCleaner.SetInfo(line));
			}
			DataAnalyser analyse = new  DataAnalyser();
			List<String> output = analyse.Predict(customerInfos,currentPrice,newUsage,newPrice,factor,maxPrice,cUsage);
			
			totalCustCount = output.size();
			maleCount = 0;
			femaleCount= 0;
			age.clear();
			state.clear();
			
			for(String s:output)
			{
				String[] l = s.split("\\|");
				if(l[3].equalsIgnoreCase("0")) continue;
				int count = state.containsKey(l[0]) ? state.get(l[0]) : 0;
				state.put(l[0], count + 1);
				int a = Integer.parseInt(l[2]);
				String k = "";
				if( a >= 10 && a <=20 )
				{k="Age(10-20)";}
				else if( a >= 21 && a <=30 )
				{k="Age(21-30)";}
				else if( a >= 31 && a <=40 )
				{k="Age(31-40)";}
				else if( a >= 41 && a <=50 )
				{k="Age(41-50)";}
				else if( a >= 51 && a <=60 )
				{k="Age(51-60)";}
				else 
				{k="Age(>65)";}
				count = age.containsKey(k) ? age.get(k) : 0;
				age.put(k, count + 1);
				if(l[1].equalsIgnoreCase("m")) maleCount++; else femaleCount++;
			}
			

		for(String key: age.keySet()) 
				System.out.println(key + " - " + age.get(key)); 

			System.out.println("totalCustCount"+totalCustCount);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
