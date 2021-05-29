package com.huida.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton6Test {
	//����ģʽ��©����ͨ����������л��������л����ƽⵥ�����Լ���α�����Щ©��
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton6 singleton=Singleton6.getInstance();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("G:/singleton.txt"));
		oos.writeObject(singleton);
		oos.flush();
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("G:/singleton.txt"));
		Singleton6  singleton2=(Singleton6) ois.readObject();
		System.out.println(singleton==singleton2);//false����˵������ӡ�����Ľ����һ����˵����2��������ǲ�ͬ�Ķ����������ƽ��˵���ģʽ
		//		Singleton6 singleton=Singleton6.getInstance();
//		Singleton6 singleton2=Singleton6.getInstance();
//		System.out.println(singleton==singleton2);//true
	}
}
