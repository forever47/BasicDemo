package com.huida.singleton;

public class Singleton {
	
	//����ģʽ��Ƴ���
	//һ�㳣���ڹ������ʵ�ֻ򴴽�������Ҫ������Դ                  
	//����ģʽ���ԭ��
	/**
	 * ���裺
	 * ����Ψһ����(���ݴ��������ʱ����ͬ���ɷ�Ϊ��������������ģʽ,��������ģʽ��Ҳ��ʵ�����ӳټ���)
	 * ˽�л��޲ι���
	 * ��������ȡΨһ���󷽷�
	 */
	//����ʽ
	private final static Singleton INSTANCE = new Singleton();
	private Singleton() {
	}
	public static  Singleton getInstance() {
		return INSTANCE;
	}
}
