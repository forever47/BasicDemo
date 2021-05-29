package com.huida.threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
/*  
 * Java通过Executors提供四种线程池，分别为：
 * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。	
 */
public class CreateThreadPool {
	public static void main(String[] args) {
		// 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
		// 这里如果去除sleep，则你会发现在这个循环中创建了新的线程，因为前一个任务没有执行完，所以创建新线程执行下一个任务。
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
		// 创建一个定长的线程池，也是根据需要去调用线程，比如线程定为100个，而循环只有10个，那么也只会用到前10个进程。
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
		// 创建一个定长线程池，支持定时及周期性任务执行。
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
		for (int i = 0; i < 10; i++) {
			newScheduledThreadPool.schedule(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName() + "----delay 3 seconds");
				}
			}, 3, TimeUnit.SECONDS);
		}
		// ---------------------------------------------------------------------------------------------------
		// 按顺序来执行线程任务 但是不同于单线程，这个线程池只是只能存在一个线程，这个线程死后另外一个线程会补上。
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