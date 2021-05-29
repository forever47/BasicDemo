package com.huida.uptonew;
/**
 * 向上造型
 * 父类引用指向子类对象，向上造型
 * 根据所指对象调用相应子类的方法
 */
public class UpTest2 {

	public static void main(String[] args) {

//		Person person=new Man();
//		person.eat();
		Person person=new Woman();
		person.eat();
	}

}
