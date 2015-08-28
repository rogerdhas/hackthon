package com.prediction;


import java.util.*;



public class DataAnalyser {
	
	List<String> output = new ArrayList<String>();
	
	
	public List<String> Predict(List<CustData> customer,Double cPrice,Double newUsage,Double newPrice,Double factor,Double maxPrice) 
	{
		Double cUsage = 1.0;
		Double calulatedUsage = (factor * (newPrice-cPrice))+ cUsage;
		for(CustData c : customer)
		{
			String key=c.state+"|"+c.gender+"|"+c.age;
			if(newPrice > maxPrice)
			{
				
				output.add(key+"|0");
				//System.out.println(key+"|0"+c.planUsage+"|"+c.actualUsage+"|"+c.price);
			}
			else if( (c.actualUsage <= c.planUsage) && (c.price < newPrice))
			{
				
				output.add(key+"|0");
				//System.out.println(key+"|0"+c.planUsage+"|"+c.actualUsage+"|"+c.price);
			}
			else if((c.actualUsage > c.planUsage) && (Math.abs(calulatedUsage-c.actualUsage) >= factor))
			{
				output.add(key+"|1");
				//System.out.println(key+"|1"+c.planUsage+"|"+c.actualUsage+"|"+c.price);
			}
			
		
		}
		
		return output;
	}

}
