package com.huida.foundation;
/**
 * ÒıÓÃ´«µİ
 * @author Thinkpad T450
 *
 */
public class TestDemo3 {
	public static void main(String[] args) {
		int[] temp = { 1, 2, 3, 4 };
		TestDemo3  t = new TestDemo3();
		t.test1(temp[1],temp);
		System.out.println(temp[1]);
	}
	public void test1(int a, int[] t) {
		t[1]=888;
		System.out.println(t[1]);
	}

}
