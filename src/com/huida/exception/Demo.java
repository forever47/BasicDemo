package com.huida.exception;

public class Demo {

	public static void main(String[] args) {
		try{
			badMethod();
			/**
			 * main�����е��þ�̬����badMethod
			 * badMethodִ��ʱ���׳�RuntimeException��֮������Start�ַ�������䲻��ִ��
			 */
			System.out.println("Start");
		}catch(RuntimeException re){//����badMethod�����׳����쳣
			System.out.println("RuntimeException");
		}catch(Exception e){
			System.out.println("Exception");
		}finally{//һ����ִ��
			System.out.println("Finally");
		}
		System.out.println("End");//���ִ��

	}

	public static void badMethod(){
		throw new RuntimeException();
	}

}
