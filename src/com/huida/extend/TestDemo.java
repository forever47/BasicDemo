package com.huida.extend;

public class TestDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a=new A();
		@SuppressWarnings("unused")
		A b=new B();
	}
}
class A{
	public A(){
		System.out.println("A is created!");
	}
}
class B extends A{
	public B(){
		System.out.println("B is created!");
	}
}