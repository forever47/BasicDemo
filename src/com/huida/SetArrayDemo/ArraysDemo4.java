package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo4 {

	public static void main(String[] args) {
		Student stu=new Student("AVENGERS3",2018);
		Student stu2=new Student("AVENGERS4",2019);
		List<Student> stus=new ArrayList<Student>();
		stus.add(stu);
		stus.add(stu2);
		System.out.println(stus);
		for(int i=0;i<stus.size();i++){
			System.out.println(stus.get(i));
		}
	}

}
