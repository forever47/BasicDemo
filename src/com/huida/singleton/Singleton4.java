package com.huida.singleton;
public class Singleton4{
	//双重检查(建议使用)
	/**
	 * 既保证线程安全
	 * 也提升系统性能
	 */
	private static Singleton4 singleton4;
	private Singleton4(){	
	}
	public Singleton4 getInstence(){
		if(singleton4==null){
			synchronized(Singleton4.class){
				if(singleton4==null){
					singleton4=new Singleton4();
				}
			}
		}
		return singleton4;
	}
}

