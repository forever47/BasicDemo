package com.huida.param;

public class PassValue {
	/**
	 * 基本数据类型的参数传递
	 * 方法的形式参数相当于方法中定义的局部变量，方法调用结束即被释放
	 * 不会影响到主程序中同名的局部变量
	 * @param args
	 */
	public static void main(String[] args) {
		int x=4;
		change(x);
		System.out.println(x);//4
	}

	private static void change(int x) {
		x=7;
	}
}
