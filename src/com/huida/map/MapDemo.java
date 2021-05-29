package com.huida.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	map.put("x","XC");
	map.put("y", "RZ");
	System.out.println(map);
	System.out.println(map.get("x"));
}
}
