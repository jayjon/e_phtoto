package com.fsq.biz;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ChangeJson {
	
	private static String toJson(Object resultobj){
        if(resultobj!=null){
            JSONArray obj=JSONArray.fromObject(resultobj);
            return(obj.toString());
        }
        return"";
    }
    private static String toJson2(Object resultobj){
        if(resultobj!=null){
            JSONObject obj=JSONObject.fromObject(resultobj);
            return obj.toString();
        }
        return null;
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ssss");
	}

}
