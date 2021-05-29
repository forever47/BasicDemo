package com.huida.equals;
public class TestPerson {
	public static void main(String[] args) {
		Person p=new Person(2016,"XC");
		Person p2=new Person(2016,"XC");
		//当我们写了一个类的时候，我们一般要重写这个类的equals方法
		//因为所有类都继承Object，而Object中的equals方法是这么写的：
		// public boolean equals(Object obj){
	   //      return this==obj;
		// }
		//也就是Object中的equals方法实际上比较的是两个对象是否是同一个（案例中p和p2是同一个类Student创建的两个不同对象，调用默认equals方法时候结果为false），显然当我们只想比较两个对象的数值是否相等的时候这不是我们所想要的
		System.out.println(p.equals(p2));//false，不是同一个
		System.out.println(p==p2);//false，地址也不一样
	}
}
