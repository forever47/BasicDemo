package com.huida.singleton;

public class Singleton5 {
	//ʹ���ڲ���
	/**
	 * �ӳټ���
	 * 		�ⲿ�����ʱ������Ҫ���������ڲ���
	 * 		����SingleTon��һ�α�����ʱ��������Ҫȥ����InstanceHolder
	 * 		ֻ�е�getInstance()������һ�α�����ʱ���Ż�ȥ��ʼ��INSTANCE,�ʶ���ռ�ڴ�
	 * ͬ��Ч�ʱȽϸ�
	 * 		ľ��synchronized�ؼ���
	 * �̰߳�ȫ
	 * 		getInstance()���������õ���InstanceHolder.INSTANCE��ȡ����InstanceHolder���INSTANCE����
	 * 		getInstance()������û�ж��ȥnew���󣬲��ܶ��ٸ��߳�ȥ����getInstance()������ȡ�Ķ���ͬһ��INSTANCE���󣬶�����ȥ���´���
	 */
	/**
	 * ȱ�㣺
	 * �޷�����ͨ������������л���ȡ�Ķ����ǵ���
	 */
	private Singleton5(){
		//˵����������ͨ������Class���������ù������������µĶ�������ֻ��Ҫ�ڹ��������ֶ��׳��쳣�����³���ֹͣ�Ϳ��ԴﵽĿ���ˣ���������룺
//		if(InstanceHolder.s5!=null){
//			throw new RuntimeException("���󴴽�ʧ��");
//		}
	}
	private static class InstanceHolder{
		private static Singleton5 s5=new Singleton5();
	}
	public static Singleton5 getInstence(){
		return InstanceHolder.s5;
	}
}
