package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraysDemo3 {
	public static void main(String[] args) {
		//输出字符串类型集合
		List<String> list=new ArrayList<String>();
		list.add("ALITA:BATTLE ANGLE");
		list.add("SPIDERMAN");
		list.add("AQUAMAN");
		System.out.println("list集合输出："+list);
		System.out.println("list集合输出："+list.get(0));
		//输出对象类型集合
		List<Object> list2=new ArrayList<Object>();
		list2.add(list);
		list2.add("TheUnfoldFuture");
		System.out.println("list2集合输出："+list2);
		//输出集合第一个元素	
		System.out.println(list2.get(0));
		//输出集合第一个元素(是一个集合)的第一个元素
		List<Object> list3=Arrays.asList(list2.get(0));
		System.out.println(list3.get(0));
	}

}
