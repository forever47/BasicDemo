package com.huida.singleton;

public class Singleton2 {
	//����ʽ
	/**
	 * ����ģʽ����ڶ���ģʽ����������Ҫʱ��Ŵ������󣬶������������ʱ��ʹ�����ʵ���ӳټ���
	 * �����ڶ��̻߳����£�������̰߳�ȫ����
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
