package com.huida.extend;

public class TestDemo2 {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.function();
		Parent p2=new Child();
		p2.function();
	}

}
class Parent{
	public void function(){
		System.out.println("���෽��������");
	}
}
class Child extends Parent{
	public void function(){
		System.out.println("���෽��������");
	}
}