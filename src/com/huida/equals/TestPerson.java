package com.huida.equals;
public class TestPerson {
	public static void main(String[] args) {
		Person p=new Person(2016,"XC");
		Person p2=new Person(2016,"XC");
		//������д��һ�����ʱ������һ��Ҫ��д������equals����
		//��Ϊ�����඼�̳�Object����Object�е�equals��������ôд�ģ�
		// public boolean equals(Object obj){
	   //      return this==obj;
		// }
		//Ҳ����Object�е�equals����ʵ���ϱȽϵ������������Ƿ���ͬһ����������p��p2��ͬһ����Student������������ͬ���󣬵���Ĭ��equals����ʱ����Ϊfalse������Ȼ������ֻ��Ƚ������������ֵ�Ƿ���ȵ�ʱ���ⲻ����������Ҫ��
		System.out.println(p.equals(p2));//false������ͬһ��
		System.out.println(p==p2);//false����ַҲ��һ��
	}
}
