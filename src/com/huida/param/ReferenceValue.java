package com.huida.param;
/**
 * 引用类型数据的参数传递
 * Java语言在给被调用方法的参数赋值时候，只采用传值的方式
 * 基本类型数据传递的是该数据的值本身
 * 引用类型数据传递的是该引用的值本身，而非对象本身
 * 此时通过方法调用，可以改变对象的内容，但是对象的引用的值是不能改变的
 * @author WYN
 *
 */
public class ReferenceValue {
	int x;
	public static void main(String[] args) {
		ReferenceValue rv=new ReferenceValue();
		rv.x=49;
		System.out.println("方法调用前，rv.x=："+rv.x);
		change(rv);
		System.out.println("方法调用后，rv.x=："+rv.x);
	}
	private static void change(ReferenceValue rv) {
		rv.x=47;
	}
	
}
