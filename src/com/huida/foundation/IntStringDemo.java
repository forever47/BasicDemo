package com.huida.foundation;

public class IntStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="47";//˫��������Ϊ��������
		/**
		 * ����ת����ʽ
		 * ����
		 * ���ȴӷ������Ϳ��Կ���parseInt���ص��ǻ�������int����valueOf���ص��Ƕ���
		 */
		int i=Integer.valueOf(str).intValue();//��String���͵ı���strת��Ϊint���͵Ķ��󲢲���ȡ��ֵ
		int j=Integer.parseInt(str);//��String���͵ı���strת��Ϊint���͵ı���j
		System.out.println("i="+i+",j="+j);
	}

}
