package com.huida.foundation;
public class CalculateDemo {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("a/b="+a/b);//除法
		System.out.println("a%b="+a%b);//取模
		//计算0到9的整数的和，忽略能被3整除的数
		//1,2,4,5,7,8
		int sum=0;
		for(int x=0;x<10;x++){
			if(x%3==0){
				//break;
				continue;
			}
			sum+=x;
		}
		int x=(int) Math.round(-1.5);
		System.out.println("sum="+sum);
		System.out.println("x="+x);
	}

}
