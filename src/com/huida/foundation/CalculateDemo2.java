package com.huida.foundation;

public class CalculateDemo2 {
public static void main(String[] args) {
	int a=68;
	char c=(char)a;
	System.out.println("c="+c);
	int num=2147483647;
	int sum=num+2;
	System.out.println(sum);//��һ�����,int�ͼ�int�ͽ��Ϊint�ͣ����
	long temp=num+2L;      
	System.out.println(temp);//�ڶ������,int�ͼ�long�ͣ����Ϊlong�ͣ�û�����
	System.out.println("************************");
	  int i = 1 ;     
      int j = i++ ; 
      if((i==(++j))&&((i++)==j)){ 
          i += j ; 
      } 
      System.out.println("i = "+i); 
}
}
