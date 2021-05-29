package com.huida.string;
//import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
//		String str="Hello";
//		String[] strings=str.split("e");
//		//System.out.println(Arrays.toString(strings));//[H, llo]
//		for(int i=0;i<strings.length;i+=1){
//			System.out.println(strings[i]);
//		}
		StringBuffer sb=new StringBuffer();
		sb.append("1234567");
		System.out.println(sb.reverse());
	}
}
