package com.huida.foundation;

public class TestString {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str="abc"+"def";
	String str2=new String(str);
	if(str==str2){
		System.out.println("4");
	}
	if(str.equals(str2)){
		System.out.println("6");
	}
	
	}

}
