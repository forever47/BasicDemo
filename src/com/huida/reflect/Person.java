package com.huida.reflect;
/**
 * ����
 * ���壺
 * ������״̬��
 * ��������һ���඼�ܹ�֪���������������Ժͷ�����
 * ��������һ�����󣬶��ܹ������������ⷽ�������ԣ������ܸı���������
 * ���壺
 * �������������ʱȡ���κ�һ����֪���Ƶ�class���ڲ���Ϣ
 * ����������modifiers(���η�)��fields(����)��methods(����)�Ȳ���������ʱ�ı�fields���ݻ����methods
 * ��ô���Ǳ���Ը����ı�д���룬�������������ʱװ�䣬���������֮�����Դ�������ӣ����ʹ������϶ȣ����ж�̬�����ʵ�ֵȵ�
 * ȱ�㣺
 * ����ʹ�ò�������ɺܸߵ���Դ����
 * ʵ�֣�
 * ���ַ�ʽ
 *  1��ͨ��������� getClass() ��������ȡ,ͨ��Ӧ���ڣ����紫����һ�� Object���͵Ķ������֪��������ʲô��
 *                  Person p1 = new Person();
 *                  Class c1 = p1.getClass();
 *  2��ֱ��ͨ�� ����.class �ķ�ʽ�õ�,�÷�����Ϊ��ȫ�ɿ����������ܸ���
 *          ˵���κ�һ���඼��һ�������ľ�̬��Ա���� class
 *                    Class c2 = Person.class;
 *  3��ͨ�� Class ����� forName() ��̬��������ȡ(����)
 *         �����׳� ClassNotFoundException �쳣
 *
 *          һ������ JVM ��ֻ����һ�� Class ʵ��,�����Ƕ������ȡ�� c1,c2,c3���� equals �Ƚϣ����ֶ���true
 * @author WYN
 *
 */
public class Person {
	@SuppressWarnings("unused")
	private String personName="VENOM";//����˽������
	
	public int age=1989;//���幫������
	
	public Person(){//�޲ι���
	}
	
	@SuppressWarnings("unused")
	private void method(){
		System.out.println("Person���˽�з���");
	}
	public void method2(){
		System.out.println("Person��Ĺ��з���");
	}
}
