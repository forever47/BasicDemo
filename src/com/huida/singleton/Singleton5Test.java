package com.huida.singleton;

import java.lang.reflect.Constructor;

public class Singleton5Test {
	//单例模式的漏洞，通过反射和序列化、反序列化来破解单例，以及如何避免这些漏洞
	public static void main(String[] args) {
		try{
			Class<?> clazz=Singleton5.class;
			Constructor c=clazz.getDeclaredConstructor(null);
			c.setAccessible(true);
			//反射调用
			Object o=c.newInstance();
			Object o2=c.newInstance();
			System.out.println(o==o2);//false　　说明：打印出来的结果不一样，说明这2个对象就是不同的对象，这样就破解了单例模式
			//正常调用
			Singleton5 s1=Singleton5.getInstence();
			Singleton5 s2=Singleton5.getInstence();
			System.out.println(s1==s2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
