package com.huida.singleton;

public class Singleton44 {
	private static Singleton44 singleton44;
	private Singleton44(){
		
	}
	public Singleton44 getInstence(){
		if(singleton44==null){
			synchronized(Singleton44.class){
				if(singleton44==null){
					singleton44=new Singleton44();
				}
			}
		}
		return singleton44;
	}
}
