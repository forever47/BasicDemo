package com.huida.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * Java创建对象4种方式：
 * new
 * 反射:1.Person preson=new Person();
 * 		      Class cla=person.getClass();
 *           3.Class cla=Person.class;
 *           2.Class cla=Class.forName("com.huida.reflect.Person");
 *克隆
 *反序列化
 * @author WYN
 *
 */
public class TestPerson {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws Exception, SecurityException {
		//第一种方式获取一个类
		Person person=new Person();
		Class c=person.getClass();
		//第二种方式获取一个类
		Class c2=Person.class;
		//第三种方式获取一个类
		Class c3=Class.forName("com.huida.reflect.Person");
		//获得类完整的名字
//		String className = c.getName();
//		System.out.println("获得类完整的名字:"+className);
//		
//		System.out.print("获得类的public类型的属性:");    
//		//获得类的public类型的属性
//		Field[] fields = c2.getFields();
//		for(Field field : fields){
//		   System.out.println(field.getName());//age
//		}
//		
//		System.out.print("获得类的所有属性(包括私有):");          
//		//获得类的所有属性。包括私有的
//		Field [] allFields = c2.getDeclaredFields();
//		for(Field field : allFields){
//		    System.out.print(field.getName()+" ");//personName    age
//		}
//		System.out.println();
		System.out.print("public类型的方法(包括 Object 类的一些方法):");         
		//获得类的public类型的方法。这里包括 Object 类的一些方法
		Method [] methods = c2.getMethods();
		for(Method method : methods){
		    System.out.print(method.getName()+" ");//method2 equls toString hashCode等
		}
		System.out.println();
		System.out.print("获得类的所有方法:"); 
		//获得类的所有方法
		Method [] allMethods = c2.getDeclaredMethods();
		for(Method method : allMethods){
		    System.out.print(method.getName());//method method2
		}
		
		 System.out.print("获得指定的属性：");     
		//获得指定的属性
		Field f1 = c2.getField("age");
		System.out.println(f1);
		
		System.out.print("获得指定的私有属性：");     
		//获得指定的私有属性
		Field f2 = c2.getDeclaredField("personName");//personName
		//启用和禁用访问安全检查的开关，值为 true，则表示反射的对象在使用时应该取消 java 语言的访问检查；反之不取消
		f2.setAccessible(true);
		System.out.println(f2);
		                
		//创建这个类的一个对象
		Object p2 =  c2.newInstance();
		//将 p2 对象的  f2 属性赋值为 Bob，f2 属性即为 私有属性 name
		f2.set(p2,"Bob");
		//使用反射机制可以打破封装性，导致了java对象的属性不安全。 
		System.out.println(f2.get(p2)); //Bob
		       
		System.out.print("获取构造方法:");
		//获取构造方法
		Constructor [] constructors = c2.getConstructors();
		for(Constructor constructor : constructors){
		    System.out.println(constructor.toString());//
		}
	}
}
