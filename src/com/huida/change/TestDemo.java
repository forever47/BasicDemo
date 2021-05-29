package com.huida.change;

public class TestDemo {
	public static void main(String[] args) {
		getSwitch(4,7);
	}

	public static void getSwitch(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		int num=2147483647;
		//long nb=2L+num;nb为2127483649
		num+=2;
		System.out.println("换位之后：a=" + a + ",b=" + b+",num="+num);
	}
}
