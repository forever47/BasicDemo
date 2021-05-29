package com.huida.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton7Test {
	/**
	 * 枚举实现的单例可轻松地解决两个问题：
    	1.线程安全问题。因为Java虚拟机在加载枚举类的时候，会使用ClassLoader的loadClass方法，这个方法使用了同步代码块来保证线程安全。
    	2.避免反序列化破坏单例。因为枚举的反序列化并不通过反射实现
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton7 singleton=Singleton7.INSTANCE;
		//在使用枚举创建单例的基础上，将创建出来的对象序列化并反序列化之后
		//产生singleton2跟singleton对比
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("G:/singleton.txt"));
		oos.writeObject(singleton);
		oos.flush();
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("G:/singleton.txt"));
		Singleton7  singleton2=(Singleton7) ois.readObject();
		System.out.println(singleton==singleton2);//true　　说明：打印出来的结果不一样，说明这2个对象就是不同的对象，这样就破解了单例模式
	}
}
