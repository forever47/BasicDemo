package com.huida.singleton;

import java.lang.reflect.Constructor;

public class Singleton5Test {
	//����ģʽ��©����ͨ����������л��������л����ƽⵥ�����Լ���α�����Щ©��
	public static void main(String[] args) {
		try{
			Class<?> clazz=Singleton5.class;
			Constructor c=clazz.getDeclaredConstructor(null);
			c.setAccessible(true);
			//�������
			Object o=c.newInstance();
			Object o2=c.newInstance();
			System.out.println(o==o2);//false����˵������ӡ�����Ľ����һ����˵����2��������ǲ�ͬ�Ķ����������ƽ��˵���ģʽ
			//��������
			Singleton5 s1=Singleton5.getInstence();
			Singleton5 s2=Singleton5.getInstence();
			System.out.println(s1==s2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
