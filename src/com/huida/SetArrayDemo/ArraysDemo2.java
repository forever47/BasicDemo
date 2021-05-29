package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysDemo2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//创建集合对象
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();
		//创建学生对象
		Student st1 = new Student("INTEL", 27);
		Student st2 = new Student("nVIDIA", 30);
		Student st3 = new Student("QUALCOMM", 30);
		Student st4 = new Student("AMD", 31);
		Student st5 = new Student("ARM", 100);
		//将学生对象，添加到集合里
		c.add(st1);
		c.add(st2);  //向上转型
		c.add(st3);
		c.add(st4);
		c.add(st5);
		System.out.println("输出集合："+c);
		//把集合转换成数组
		Object[] obj = c.toArray();
		//开始遍历
		for(int i=0;i<obj.length;i++){
		Student  s = (Student)obj[i]; //向下转型
		System.out.println(s.getName()+","+s.getAge());
		}
		System.out.println("===============================");
		for(int i=0;i<obj.length;i++){
		Student  s = (Student)obj[i];  //转型时，要注意，
		System.out.println("对象 "+s+"：姓名----"+s.name+",年龄----"+s.age);
		}
	}
	
}
