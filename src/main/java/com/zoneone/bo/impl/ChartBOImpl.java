package com.zoneone.bo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.prediction.Loader;
import com.zonenone.dao.databeans.Plan;
import com.zonenone.form.PlanFormBean;

public class ChartBOImpl {
	
	private String getPlanType(int amt){
		String planTyp = "Small";
		if(amt >= 45 && amt <= 60){
			planTyp = "Medium";
		} else if(amt >= 61 && amt <= 80){
			planTyp = "Large";
		} else if(amt >= 81){
			planTyp = "XL";
		} 
		return planTyp;
	}
	
	public String getMap(PlanFormBean planFormBean) throws JSONException{
		
		//Plansize, dataSize, amt
		Loader.analyse(this.getPlanType(Integer.parseInt(planFormBean.getAmt())),
				Double.parseDouble(planFormBean.getData()), Double.parseDouble(planFormBean.getAmt()));
		Map<String,Integer> state = Loader.state;
		List<JSONObject> jsonList = new ArrayList<>();
		JSONObject jsonObj = null;
		for (Map.Entry<String, Integer> entry : state.entrySet()) {
			jsonObj = new JSONObject();
			jsonObj.put("state", entry.getKey());
			jsonObj.put("count", entry.getValue());
			jsonList.add(jsonObj);
		}
		String json = jsonList.toString();
		return json;
	}

	public String getMorrisBar(PlanFormBean planFormBean) throws JSONException {
		Loader.analyse(this.getPlanType(Integer.parseInt(planFormBean.getAmt())),
				Double.parseDouble(planFormBean.getData()), Double.parseDouble(planFormBean.getAmt()));
		List<JSONObject> list = new ArrayList<>();
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("state", "Gender");
		jsonObj.put("totalCount", String.valueOf(Loader.totalCustCount));
		jsonObj.put("maleCount", String.valueOf(Loader.maleCount));
		jsonObj.put("femaleCount", String.valueOf(Loader.femaleCount));
		list.add(jsonObj);
		jsonObj = new JSONObject();
		jsonObj.put("state", "USA");
		jsonObj.put("totalCount", String.valueOf(Loader.totalCustCount));
		jsonObj.put("maleCount", String.valueOf(Loader.maleCount));
		jsonObj.put("femaleCount", String.valueOf(Loader.femaleCount));
		//list.add(jsonObj);
		String json = list.toString();
		return json;
	}
	
	public double getLiquidCount(PlanFormBean planFormBean){
		Loader.analyse(this.getPlanType(Integer.parseInt(planFormBean.getAmt())),
				Double.parseDouble(planFormBean.getData()), Double.parseDouble(planFormBean.getAmt()));
		double totalCount = Loader.totalCustCount;
		double genderCount = Loader.maleCount + Loader.femaleCount;
		double percentage = ((totalCount - genderCount) / totalCount) * 100;
		return percentage;
	}

	public String getBubbleChartJsonStr(PlanFormBean planFormBean) throws JSONException {
		
		//Plansize, dataSize, amt
		Loader.analyse(this.getPlanType(Integer.parseInt(planFormBean.getAmt())),
				Double.parseDouble(planFormBean.getData()), Double.parseDouble(planFormBean.getAmt()));
		Map<String,Integer> age = Loader.age;
		String result = "[['Age group', 'Total Count']";
		for (Map.Entry<String, Integer> entry : age.entrySet()) {
			result += ",['"+ entry.getKey() +"',"+ entry.getValue() +"]";
		}
		
		result += "]";
		return result;
	}


	private String getBubbleJs(String result) {
		result = " {text: \"Java\", count: \"236\"},      {text: \".Net\", count: \"382\"},";
		String jsData = "$(document).ready(function () {  \n"+
				"	var bubbleChart = new d3.svg.BubbleChart({ \n"+
				 "   supportResponsive: true, \n"+
				 "   size: 600, \n"+
				 "   innerRadius: 600 / 3.5, \n"+
				 "   radiusMin: 50, \n"+
				 "   data: { \n"+
				 "     items: [ \n"+ result +
				 "           ], \n"+
				 "     eval: function (item) {return item.count;}, \n"+
				 "     classed: function (item) {return item.text.split(\" \").join(\"\");} \n"+
				 "   }, \n"+
				 "   plugins: [ \n"+
				 "     { \n"+
				 "       name: \"central-click\", \n"+
				 "       options: { \n"+
				 "         text: \"\", \n"+
				 "         style: { \n"+
				 "           \"font-size\": \"12px\", \n"+
				 "           \"font-style\": \"italic\", \n"+
				 "           \"font-family\": \"Source Sans Pro, sans-serif\", \n"+
				 "           \"text-anchor\": \"middle\", \n"+
				 "           \"fill\": \"white\" \n"+
				 "         }, \n"+
				 "         attr: {dy: \"65px\"}, \n"+
				"          centralClick: function() { \n"+
				"          } \n"+
				"        } \n"+
				"      }, \n"+
				"      { \n"+
				"        name: \"lines\", \n"+
				 "       options: { \n"+
				 "         format: [ \n"+
				"            { \n"+
				"              textField: \"count\", \n"+
				"              classed: {count: true}, \n"+
				 "             style: { \n"+
				 "               \"font-size\": \"28px\", \n"+
				 "               \"font-family\": \"Source Sans Pro, sans-serif\", \n"+
				 "               \"text-anchor\": \"middle\", \n"+
				 "               fill: \"white\" \n"+
				 "             }, \n"+
				 "             attr: { \n"+
				 "               dy: \"0px\", \n"+
				 "               x: function (d) {return d.cx;}, \n"+
				 "               y: function (d) {return d.cy;} \n"+
				 "             } \n"+
				 "           }, \n"+
				 "           { \n"+
				 "             textField: \"text\", \n"+
				 "             classed: {text: true}, \n"+
				           "   style: { \n"+
				          "      \"font-size\": \"14px\", \n"+
				         "       \"font-family\": \"Source Sans Pro, sans-serif\", \n"+
				        "        \"text-anchor\": \"middle\", \n"+
				       "         fill: \"white\" \n"+
				      "        }, \n"+
				     "         attr: { \n"+
				             "   dy: \"20px\", \n"+
				            "    x: function (d) {return d.cx;}, \n"+
				           "     y: function (d) {return d.cy;} \n"+
				          "    } \n"+
				         "   } \n"+
				        "  ], \n"+
				       "   centralFormat: [ \n"+
				           " { \n"+
				          "    style: {\"font-size\": \"50px\"}, \n"+
				         "     attr: {} \n"+
				        "    }, \n"+
				       "     { \n"+
				      "       style: {\"font-size\": \"30px\"}, \n"+
				     "         attr: {dy: \"40px\"} \n"+
				    "        } \n"+
				   "       ] \n"+
				  "      } \n"+
				 "     }] \n"+
				"  }); \n"+
				" }); ";
		return jsData;
	}
}
