package com.huida.foundation;
/**
 * ֵ����
 * @author Thinkpad T450
 *
 */
public class TestDemo2 {
	public void test1(int a){
		a=4;
		 System.out.println("test1�����е�a="+a);
	}
	public static void main(String[] args) {
		TestDemo2 t=new TestDemo2();
		int a=7;
		t.test1(a);
		System.out.println("main�����е�a="+a);
	}

}
