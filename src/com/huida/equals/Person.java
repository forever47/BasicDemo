package com.huida.equals;

public class Person {
	/**
	 * δ����equals����
	 */
	int age;
	String name;
public Person() {
	}
public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}
}
