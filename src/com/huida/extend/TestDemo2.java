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
		System.out.println("父类方法被调用");
	}
}
class Child extends Parent{
	public void function(){
		System.out.println("子类方法被调用");
	}
}