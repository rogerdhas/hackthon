package com.zoneone.bo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.prediction.Loader;

public class ChartBOImpl {
	
	public String getMap() throws JSONException{
		
		//Plansize, dataSize, amt
		Loader.analyse("Small", 1.5d, 35.0d);
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

	public String getMorrisBar() throws JSONException {
		Loader.analyse("Small", 2.5d, 5.0d);
		List<JSONObject> list = new ArrayList<>();
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("state", "USA");
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
	
	public Integer getLiquidCount(){
		Loader.analyse("Small", 2.5d, 5.0d);
		int totalCount = Loader.totalCustCount;
		int genderCount = Loader.maleCount + Loader.femaleCount;
		int percentage = ((totalCount - genderCount) / totalCount) * 100;
		return percentage;
	}

	public String getBubbleChartJsonStr() throws JSONException {
		
		//Plansize, dataSize, amt
		Loader.analyse("Small", 1.5d, 35.0d);
		Map<String,Integer> age = Loader.age;
		String result = "";
		for (Map.Entry<String, Integer> entry : age.entrySet()) {
			result = result + " {text: \""+entry.getKey()+"\", count: \""+entry.getValue()+"\"},\n ";
		}
		
		String json = this.getBubbleJs(result);
		return json;
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
