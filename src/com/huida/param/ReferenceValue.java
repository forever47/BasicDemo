package com.huida.param;
/**
 * �����������ݵĲ�������
 * Java�����ڸ������÷����Ĳ�����ֵʱ��ֻ���ô�ֵ�ķ�ʽ
 * �����������ݴ��ݵ��Ǹ����ݵ�ֵ����
 * �����������ݴ��ݵ��Ǹ����õ�ֵ�������Ƕ�����
 * ��ʱͨ���������ã����Ըı��������ݣ����Ƕ�������õ�ֵ�ǲ��ܸı��
 * @author WYN
 *
 */
public class ReferenceValue {
	int x;
	public static void main(String[] args) {
		ReferenceValue rv=new ReferenceValue();
		rv.x=49;
		System.out.println("��������ǰ��rv.x=��"+rv.x);
		change(rv);
		System.out.println("�������ú�rv.x=��"+rv.x);
	}
	private static void change(ReferenceValue rv) {
		rv.x=47;
	}
	
}
