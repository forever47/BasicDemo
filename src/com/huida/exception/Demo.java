package com.huida.exception;

public class Demo {

	public static void main(String[] args) {
		try{
			badMethod();
			/**
			 * main方法中调用静态方法badMethod
			 * badMethod执行时候抛出RuntimeException，之后的输出Start字符串的语句不再执行
			 */
			System.out.println("Start");
		}catch(RuntimeException re){//捕获badMethod方法抛出的异常
			System.out.println("RuntimeException");
		}catch(Exception e){
			System.out.println("Exception");
		}finally{//一定会执行
			System.out.println("Finally");
		}
		System.out.println("End");//最后执行

	}

	public static void badMethod(){
		throw new RuntimeException();
	}

}
