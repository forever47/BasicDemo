package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysDemo2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//�������϶���
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();
		//����ѧ������
		Student st1 = new Student("INTEL", 27);
		Student st2 = new Student("nVIDIA", 30);
		Student st3 = new Student("QUALCOMM", 30);
		Student st4 = new Student("AMD", 31);
		Student st5 = new Student("ARM", 100);
		//��ѧ��������ӵ�������
		c.add(st1);
		c.add(st2);  //����ת��
		c.add(st3);
		c.add(st4);
		c.add(st5);
		System.out.println("������ϣ�"+c);
		//�Ѽ���ת��������
		Object[] obj = c.toArray();
		//��ʼ����
		for(int i=0;i<obj.length;i++){
		Student  s = (Student)obj[i]; //����ת��
		System.out.println(s.getName()+","+s.getAge());
		}
		System.out.println("===============================");
		for(int i=0;i<obj.length;i++){
		Student  s = (Student)obj[i];  //ת��ʱ��Ҫע�⣬
		System.out.println("���� "+s+"������----"+s.name+",����----"+s.age);
		}
	}
	
}
