package com.huida.foundation;
import java.util.HashMap;
import java.util.Map;
public class TestHashMap {
	public static void main(String[] args) {
	Map<String,String> results=new HashMap<String,String>();
	results.put("AVATAR", "2009");
	results.put("ALITA:BATTLE ANGLE", "2019");
	System.out.println(results);
	System.out.println(results.toString());
	System.out.println(results.get("AVATAR"));
	}
}
