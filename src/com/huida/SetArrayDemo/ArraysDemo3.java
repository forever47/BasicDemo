package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraysDemo3 {
	public static void main(String[] args) {
		//����ַ������ͼ���
		List<String> list=new ArrayList<String>();
		list.add("ALITA:BATTLE ANGLE");
		list.add("SPIDERMAN");
		list.add("AQUAMAN");
		System.out.println("list���������"+list);
		System.out.println("list���������"+list.get(0));
		//����������ͼ���
		List<Object> list2=new ArrayList<Object>();
		list2.add(list);
		list2.add("TheUnfoldFuture");
		System.out.println("list2���������"+list2);
		//������ϵ�һ��Ԫ��	
		System.out.println(list2.get(0));
		//������ϵ�һ��Ԫ��(��һ������)�ĵ�һ��Ԫ��
		List<Object> list3=Arrays.asList(list2.get(0));
		System.out.println(list3.get(0));
	}

}
