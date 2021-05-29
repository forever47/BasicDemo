package com.huida.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton6Test {
	//单例模式的漏洞，通过反射和序列化、反序列化来破解单例，以及如何避免这些漏洞
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton6 singleton=Singleton6.getInstance();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("G:/singleton.txt"));
		oos.writeObject(singleton);
		oos.flush();
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("G:/singleton.txt"));
		Singleton6  singleton2=(Singleton6) ois.readObject();
		System.out.println(singleton==singleton2);//false　　说明：打印出来的结果不一样，说明这2个对象就是不同的对象，这样就破解了单例模式
		//		Singleton6 singleton=Singleton6.getInstance();
//		Singleton6 singleton2=Singleton6.getInstance();
//		System.out.println(singleton==singleton2);//true
	}
}
