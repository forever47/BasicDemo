package com.huida.stringarraymap;
import java.util.HashMap;
import java.util.Map;
public class TypeTransform {

	public static void main(String[] args) {
		String str="TIM,MANU,DIRK,WADE";
		String[] strArray=str.split(",");
		Map<String,Object> map=new HashMap<String,Object>();
		for(int i=0;i<strArray.length;i++){
			map.put("Player"+i, strArray[i]);
		}
		System.out.println(map);
		//{Player3=WADE, Player2=DIRK, Player1=MANU, Player0=TIM}
		//["1","2"]
	}

}
