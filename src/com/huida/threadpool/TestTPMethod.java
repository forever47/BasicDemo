package com.huida.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestTPMethod {
//	线程池的submit和execute方法区别
//	线程池中的execute方法大家都不陌生，即开启线程执行池中的任务。还有一个方法submit也可以做到，它的功能是提交指定的任务去执行并且返回Future对象，即执行的结果。下面简要介绍一下两者的三个区别：
//	1、接收的参数不一样
//	2、submit有返回值，而execute没有
//	用到返回值的例子，比如说我有很多个做validation的task，我希望所有的task执行完，然后每个task告诉我它的执行结果，是成功还是失败，如果是失败，原因是什么。
//	然后我就可以把所有失败的原因综合起来发给调用者。
//	3、submit方便Exception处理
//	意思就是如果你在你的task里会抛出checked或者unchecked exception，
//	而你又希望外面的调用者能够感知这些exception并做出及时的处理，那么就需要用到submit，通过捕获Future.get抛出的异常。
	public static void main(String[] args) {
		 ExecutorService pool = Executors.newFixedThreadPool(2);    
	        /**
	         * execute(Runnable x) 没有返回值。可以执行任务，但无法判断任务是否成功完成。
	         */
	        pool.execute(new RunnableTest("Task1")); 
	        
	        /**
	         * submit(Runnable x) 返回一个future。可以用这个future来判断任务是否成功完成。请看下面：
	         */
	        @SuppressWarnings("rawtypes")
			Future future = pool.submit(new RunnableTest("Task2"));
	        
	        try {
	            if(future.get()==null){//如果Future's get返回null，任务完成
	                System.out.println("任务完成");
	            }
	        } catch (InterruptedException e) {
	        } catch (ExecutionException e) {
	            //否则我们可以看看任务失败的原因是什么
	            System.out.println(e.getCause().getMessage());
	        }

	}

}
