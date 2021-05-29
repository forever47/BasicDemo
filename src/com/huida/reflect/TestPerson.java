package com.huida.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * Java��������4�ַ�ʽ��
 * new
 * ����:1.Person preson=new Person();
 * 		      Class cla=person.getClass();
 *           3.Class cla=Person.class;
 *           2.Class cla=Class.forName("com.huida.reflect.Person");
 *��¡
 *�����л�
 * @author WYN
 *
 */
public class TestPerson {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws Exception, SecurityException {
		//��һ�ַ�ʽ��ȡһ����
		Person person=new Person();
		Class c=person.getClass();
		//�ڶ��ַ�ʽ��ȡһ����
		Class c2=Person.class;
		//�����ַ�ʽ��ȡһ����
		Class c3=Class.forName("com.huida.reflect.Person");
		//���������������
//		String className = c.getName();
//		System.out.println("���������������:"+className);
//		
//		System.out.print("������public���͵�����:");    
//		//������public���͵�����
//		Field[] fields = c2.getFields();
//		for(Field field : fields){
//		   System.out.println(field.getName());//age
//		}
//		
//		System.out.print("��������������(����˽��):");          
//		//�������������ԡ�����˽�е�
//		Field [] allFields = c2.getDeclaredFields();
//		for(Field field : allFields){
//		    System.out.print(field.getName()+" ");//personName    age
//		}
//		System.out.println();
		System.out.print("public���͵ķ���(���� Object ���һЩ����):");         
		//������public���͵ķ������������ Object ���һЩ����
		Method [] methods = c2.getMethods();
		for(Method method : methods){
		    System.out.print(method.getName()+" ");//method2 equls toString hashCode��
		}
		System.out.println();
		System.out.print("���������з���:"); 
		//���������з���
		Method [] allMethods = c2.getDeclaredMethods();
		for(Method method : allMethods){
		    System.out.print(method.getName());//method method2
		}
		
		 System.out.print("���ָ�������ԣ�");     
		//���ָ��������
		Field f1 = c2.getField("age");
		System.out.println(f1);
		
		System.out.print("���ָ����˽�����ԣ�");     
		//���ָ����˽������
		Field f2 = c2.getDeclaredField("personName");//personName
		//���úͽ��÷��ʰ�ȫ���Ŀ��أ�ֵΪ true�����ʾ����Ķ�����ʹ��ʱӦ��ȡ�� java ���Եķ��ʼ�飻��֮��ȡ��
		f2.setAccessible(true);
		System.out.println(f2);
		                
		//����������һ������
		Object p2 =  c2.newInstance();
		//�� p2 �����  f2 ���Ը�ֵΪ Bob��f2 ���Լ�Ϊ ˽������ name
		f2.set(p2,"Bob");
		//ʹ�÷�����ƿ��Դ��Ʒ�װ�ԣ�������java��������Բ���ȫ�� 
		System.out.println(f2.get(p2)); //Bob
		       
		System.out.print("��ȡ���췽��:");
		//��ȡ���췽��
		Constructor [] constructors = c2.getConstructors();
		for(Constructor constructor : constructors){
		    System.out.println(constructor.toString());//
		}
	}
}
