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
	//说明：这个方法是基于回调的，反序列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要在创建新的对象！
	//添加该方法后，保证通过序列化和反序列化等操作之后，获取的对象仍然为单例
	private Object readResolve () throws ObjectStreamException{
		return INSTANCE;
	}
}
