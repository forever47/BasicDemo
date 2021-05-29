package com.huida.singleton;
public class Singleton3 {
	//同步方法
	/**
	 * 实现延迟加载同时也保证了线程安全
	 * 但是效率又降低下来
	 */
	private  static Singleton3 singleton3;
	private Singleton3() {
	}
	public static synchronized Singleton3 getInstance() {
		if(singleton3==null){
			singleton3=new Singleton3();
		}
		return singleton3;
	}
}
//同步代码块
//public class Singleton4 {
//	private  static Singleton4 singleton4;
//	private Singleton4() {
//	}
//	public static  Singleton4 getInstance() {
//		if(singleton4==null){
//			synchronized(Singleton4.class){
//				singleton4=new Singleton4();
//			}	
//		}
//		return singleton4;
//	}
//}
