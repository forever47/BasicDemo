package com.huida.singleton;
public class Singleton4{
	//˫�ؼ��(����ʹ��)
	/**
	 * �ȱ�֤�̰߳�ȫ
	 * Ҳ����ϵͳ����
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

