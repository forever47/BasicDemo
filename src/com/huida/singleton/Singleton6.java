package com.huida.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton6 implements Serializable {
	private final static Singleton6 INSTANCE = new Singleton6();
	private Singleton6() {
	}
	public static Singleton6 getInstance() {
		return INSTANCE;
	}
	//˵������������ǻ��ڻص��ģ������л�ʱ�����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󣬶�����Ҫ�ڴ����µĶ���
	//��Ӹ÷����󣬱�֤ͨ�����л��ͷ����л��Ȳ���֮�󣬻�ȡ�Ķ�����ȻΪ����
	private Object readResolve () throws ObjectStreamException{
		return INSTANCE;
	}
}
