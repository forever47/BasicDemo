package com.huida.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTest2 {
/**
 * 每4秒钟打印一个DX
 * @param args
 */
	public static void main(String[] args) {
		ThreadImp threadImp = new ThreadImp();
		Thread thread1 = new Thread(threadImp);
		thread1.start();

	}

}
class ThreadImp extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("StartThread-"+(i+1)+":"+new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:Ms").format(new Date()));
			System.out.println("XCDX");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}