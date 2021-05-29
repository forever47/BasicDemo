package com.huida.foundation;

public class TestStatic {
	static  int x=10;
	static int[] arr=new int[10];
	
	static{
		x+=5;
	}
public static void main(String[] args) {
	System.out.println("x="+x);
	System.out.println(arr[1]);
}
static{
	x/=3;
}
}
