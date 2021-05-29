package com.huida.foundation;

public class IntStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="47";//双引号里面为整型数据
		/**
		 * 两种转换方式
		 * 区别
		 * 首先从返回类型可以看出parseInt返回的是基本类型int，而valueOf返回的是对象
		 */
		int i=Integer.valueOf(str).intValue();//将String类型的变量str转换为int类型的对象并并获取其值
		int j=Integer.parseInt(str);//将String类型的变量str转换为int类型的变量j
		System.out.println("i="+i+",j="+j);
	}

}
