package com.huida.singleton;

public class Singleton5 {
	//使用内部类
	/**
	 * 延迟加载
	 * 		外部类加载时并不需要立即加载内部类
	 * 		即当SingleTon第一次被加载时，并不需要去加载InstanceHolder
	 * 		只有当getInstance()方法第一次被调用时，才会去初始化INSTANCE,故而不占内存
	 * 同步效率比较高
	 * 		木有synchronized关键字
	 * 线程安全
	 * 		getInstance()方法，调用的是InstanceHolder.INSTANCE，取的是InstanceHolder里的INSTANCE对象
	 * 		getInstance()方法并没有多次去new对象，不管多少个线程去调用getInstance()方法，取的都是同一个INSTANCE对象，而不用去重新创建
	 */
	/**
	 * 缺点：
	 * 无法避免通过反射或者序列化获取的对象不是单例
	 */
	private Singleton5(){
		//说明：反射是通过它的Class对象来调用构造器创建出新的对象，我们只需要在构造器中手动抛出异常，导致程序停止就可以达到目的了，看下面代码：
//		if(InstanceHolder.s5!=null){
//			throw new RuntimeException("对象创建失败");
//		}
	}
	private static class InstanceHolder{
		private static Singleton5 s5=new Singleton5();
	}
	public static Singleton5 getInstence(){
		return InstanceHolder.s5;
	}
}
