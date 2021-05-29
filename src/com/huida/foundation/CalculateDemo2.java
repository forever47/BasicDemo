package com.huida.foundation;

public class CalculateDemo2 {
public static void main(String[] args) {
	int a=68;
	char c=(char)a;
	System.out.println("c="+c);
	int num=2147483647;
	int sum=num+2;
	System.out.println(sum);//第一种情况,int型加int型结果为int型，溢出
	long temp=num+2L;      
	System.out.println(temp);//第二种情况,int型加long型，结果为long型，没有溢出
	System.out.println("************************");
	  int i = 1 ;     
      int j = i++ ; 
      if((i==(++j))&&((i++)==j)){ 
          i += j ; 
      } 
      System.out.println("i = "+i); 
}
}
