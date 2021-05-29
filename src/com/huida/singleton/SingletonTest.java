package com.huida.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		//测试使用单例模式创建出来的对象
//		Singleton a = Singleton.getInstance();
//		Singleton b = Singleton.getInstance();
//		System.out.println(a==b);//==    equals
//		System.out.println(a.equals(b));
//		
//		SingletonDemo sd=SingletonDemo.getInstance();
//		SingletonDemo sd2=SingletonDemo.getInstance();
//		System.out.println(sd==sd2);
//		System.out.println(sd.equals(sd2));
		Class<Singleton44> singleton4=Singleton44.class;
		Class<Singleton44> singleton44=Singleton44.class;
		System.out.println(singleton4.equals(singleton44));
	}
}
