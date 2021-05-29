package com.huida.singleton;

public class Singleton2 {
	//懒汉式
	/**
	 * 懒汉模式相比于饿汉模式，可以在需要时候才创建对象，而不是在类加载时候就创建，实现延迟加载
	 * 但是在多线程环境下，会带来线程安全问题
	 */
	private  static Singleton2 singleton2;
	private Singleton2() {
	}
	public static Singleton2 getInstance() {
		if(singleton2==null){
			singleton2=new Singleton2();
		}
		return singleton2;
	}
}
