package com.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public class jsonDemo {
    
    public JSONArray getData(){
        JSONArray ja = new JSONArray();
        JSONObject jo = new JSONObject();
        jo.put("id", 1);
        jo.put("name", "test1");
        ja.add(jo);
        
        JSONObject jo1 = new JSONObject();
        jo1.put("id", 2);
        jo1.put("name", "test21");
        ja.add(jo1);
        
        JSONObject jo2 = new JSONObject();
        jo2.put("id", 3);
        jo2.put("name", "test3");
        ja.add(jo);
        
        return ja;
    }
}
