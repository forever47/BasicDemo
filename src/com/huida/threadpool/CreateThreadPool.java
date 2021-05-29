package com.huida.threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
/*  
 * Javaͨ��Executors�ṩ�����̳߳أ��ֱ�Ϊ��
 * newCachedThreadPool����һ���ɻ����̳߳أ�����̳߳س��ȳ���������Ҫ���������տ����̣߳����޿ɻ��գ����½��̡߳�
 * newFixedThreadPool ����һ�������̳߳أ��ɿ����߳���󲢷������������̻߳��ڶ����еȴ���
 * newScheduledThreadPool ����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С�
 * newSingleThreadExecutor ����һ�����̻߳����̳߳أ���ֻ����Ψһ�Ĺ����߳���ִ�����񣬱�֤����������ָ��˳��(FIFO, LIFO, ���ȼ�)ִ�С�	
 */
public class CreateThreadPool {
	public static void main(String[] args) {
		// �̳߳�Ϊ���޴󣬵�ִ�еڶ�������ʱ��һ�������Ѿ���ɣ��Ḵ��ִ�е�һ��������̣߳�������ÿ���½��̡߳�
		// �������ȥ��sleep������ᷢ�������ѭ���д������µ��̣߳���Ϊǰһ������û��ִ���꣬���Դ������߳�ִ����һ������
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			newCachedThreadPool.execute(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName() + "----" + index);
				}
			});
		}
		// ---------------------------------------------------------------------------------------------------
		// ����һ���������̳߳أ�Ҳ�Ǹ�����Ҫȥ�����̣߳������̶߳�Ϊ100������ѭ��ֻ��10������ôҲֻ���õ�ǰ10�����̡�
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			newFixedThreadPool.execute(new Runnable() {
				public void run() {
					// Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName() + "----" + index);
				}
			});
		}
		// ---------------------------------------------------------------------------------------------------
		// ����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С�
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
		for (int i = 0; i < 10; i++) {
			newScheduledThreadPool.schedule(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName() + "----delay 3 seconds");
				}
			}, 3, TimeUnit.SECONDS);
		}
		// ---------------------------------------------------------------------------------------------------
		// ��˳����ִ���߳����� ���ǲ�ͬ�ڵ��̣߳�����̳߳�ֻ��ֻ�ܴ���һ���̣߳�����߳���������һ���̻߳Ჹ�ϡ�
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			newSingleThreadExecutor.execute(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName() + "----" + index);
				}
			});
		}
	}
}