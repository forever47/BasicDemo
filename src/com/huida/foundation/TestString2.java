package com.huida.foundation;

public class TestString2 {

	public static void main(String[] args) {
		 String s1 = "Java";
	        String s2 = "Java";
	        String s3 = new String("Java");
	        String s4 = new String("Java");
	        //1、==两个字符串@新建对象之前比较
	        System.out.println("s1==s2:"+(s1==s2));//true
	        //2、==字符串与新建对象比较
	        System.out.println("s1==s3:"+(s1==s3));//false
	        //3、==两个字符串@新建对象之后比较
	        System.out.println("s3==s4:"+(s3==s4));//false
	        //1、equals两个字符串@新建对象之前比较
	        System.out.println("s1.equals(s2):"+(s1.equals(s2)));//true
	        //2、equals字符串与新建对象比较
	        System.out.println("s1.equals(s3):"+(s1.equals(s3)));//true
	        //3、equals两个字符串@新建对象之后比较
	        System.out.println("s3.equals(s4)"+(s3.equals(s4)));//true
	        //反转字符串
	        String str="上海";
			StringBuilder sb = new StringBuilder(str);	                  
		    String str2= sb.reverse().toString();
	       System.out.println(str2);
	}

}
