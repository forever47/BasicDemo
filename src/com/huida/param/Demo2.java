package com.huida.param;

public class Demo2 {
	int a;
	public int getParam(){
		return a=49;
	}
	public int getParam2(){
		return a=47;
	}
	
	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		System.out.println(demo.getParam2());//47
		System.out.println(demo.getParam());//49
		System.out.println(demo.a);//49
		
	}
}
