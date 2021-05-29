package com.huida.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton7Test {
	/**
	 * ö��ʵ�ֵĵ��������ɵؽ���������⣺
    	1.�̰߳�ȫ���⡣��ΪJava������ڼ���ö�����ʱ�򣬻�ʹ��ClassLoader��loadClass�������������ʹ����ͬ�����������֤�̰߳�ȫ��
    	2.���ⷴ���л��ƻ���������Ϊö�ٵķ����л�����ͨ������ʵ��
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton7 singleton=Singleton7.INSTANCE;
		//��ʹ��ö�ٴ��������Ļ����ϣ������������Ķ������л��������л�֮��
		//����singleton2��singleton�Ա�
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("G:/singleton.txt"));
		oos.writeObject(singleton);
		oos.flush();
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("G:/singleton.txt"));
		Singleton7  singleton2=(Singleton7) ois.readObject();
		System.out.println(singleton==singleton2);//true����˵������ӡ�����Ľ����һ����˵����2��������ǲ�ͬ�Ķ����������ƽ��˵���ģʽ
	}
}
