package com.huida.finallydemo;

public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}
    @SuppressWarnings("finally")
	public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a �ڳ���ִ�е���һ����ʱ�����ﲻ��return a ���� return 30���������·�����γ���
             * �����أ������ֺ��滹��finally�����Լ���ִ��finally�����ݣ�a=40
             * �ٴλص���ǰ��·��,������return 30���γɷ���·��֮�������a�Ͳ���a�����ˣ����ǳ���30
             */
        } finally {
            a = 40;
            return a;//������������������γ���һ������·��������ֻ��ͨ��1��return���أ���������ֱ�ӷ���40
        }
		
    }
}
