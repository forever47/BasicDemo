package com.huida.reflect;
/**
 * 反射
 * 定义：
 * 在运行状态中
 * 对于任意一个类都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意方法和属性；并且能改变它的属性
 * 意义：
 * 允许程序在运行时取得任何一个已知名称的class的内部信息
 * 包括包括其modifiers(修饰符)，fields(属性)，methods(方法)等并可于运行时改变fields内容或调用methods
 * 那么我们便可以更灵活的编写代码，代码可以在运行时装配，无需在组件之间进行源代码链接，降低代码的耦合度；还有动态代理的实现等等
 * 缺点：
 * 反射使用不当会造成很高的资源消耗
 * 实现：
 * 三种方式
 *  1、通过对象调用 getClass() 方法来获取,通常应用在：比如传过来一个 Object类型的对象而不知道具体是什么类
 *                  Person p1 = new Person();
 *                  Class c1 = p1.getClass();
 *  2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
 *          说明任何一个类都有一个隐含的静态成员变量 class
 *                    Class c2 = Person.class;
 *  3、通过 Class 对象的 forName() 静态方法来获取(常用)
 *         可能抛出 ClassNotFoundException 异常
 *
 *          一个类在 JVM 中只会有一个 Class 实例,即我们对上面获取的 c1,c2,c3进行 equals 比较，发现都是true
 * @author WYN
 *
 */
public class Person {
	@SuppressWarnings("unused")
	private String personName="VENOM";//定义私有属性
	
	public int age=1989;//定义公有属性
	
	public Person(){//无参构造
	}
	
	@SuppressWarnings("unused")
	private void method(){
		System.out.println("Person类的私有方法");
	}
	public void method2(){
		System.out.println("Person类的公有方法");
	}
}
