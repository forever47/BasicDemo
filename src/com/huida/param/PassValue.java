package com.huida.param;

public class PassValue {
	/**
	 * �����������͵Ĳ�������
	 * ��������ʽ�����൱�ڷ����ж���ľֲ��������������ý��������ͷ�
	 * ����Ӱ�쵽��������ͬ���ľֲ�����
	 * @param args
	 */
	public static void main(String[] args) {
		int x=4;
		change(x);
		System.out.println(x);//4
	}

	private static void change(int x) {
		x=7;
	}
}
