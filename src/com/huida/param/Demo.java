package com.huida.param;

import java.util.Arrays;
/**
 * java参数传递
 * 基本数据类型：传递的是值
 * 引用数据类型：传递的是地址
 * @author Thinkpad T450
 *
 */
public class Demo {
	public static void main(String[] args) {
		int a=1;
		String b="hello";
		Integer c=1479;
		int[] d={1,4,7,9};
		MyData myData=new MyData();
		change(a,b,c,d,myData);
		System.out.println("a="+a+",b="+b+",c="+c+",d="+Arrays.toString(d)+",myData.a="+myData.my);
	}
public static  void change(int a,String b,Integer c,int[] d, MyData myData){
	a=10;
	b="world";
	d[0]=1898;
	myData.my=574;
	}
}

class MyData{
	int my=580;
}