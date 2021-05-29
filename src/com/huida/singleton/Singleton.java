package com.huida.singleton;

public class Singleton {
	
	//单例模式设计初衷
	//一般常用在工具类的实现或创建对象需要消耗资源                  
	//单例模式设计原则
	/**
	 * 步骤：
	 * 创建唯一对象(根据创建对象的时机不同，可分为饿汉和懒汉两种模式,其中懒汉模式，也即实现了延迟加载)
	 * 私有化无参构造
	 * 公开化获取唯一对象方法
	 */
	//饿汉式
	private final static Singleton INSTANCE = new Singleton();
	private Singleton() {
	}
	public static  Singleton getInstance() {
		return INSTANCE;
	}
}
