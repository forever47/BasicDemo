package com.huida.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestTPMethod {
//	�̳߳ص�submit��execute��������
//	�̳߳��е�execute������Ҷ���İ�����������߳�ִ�г��е����񡣻���һ������submitҲ�������������Ĺ������ύָ��������ȥִ�в��ҷ���Future���󣬼�ִ�еĽ���������Ҫ����һ�����ߵ���������
//	1�����յĲ�����һ��
//	2��submit�з���ֵ����executeû��
//	�õ�����ֵ�����ӣ�����˵���кܶ����validation��task����ϣ�����е�taskִ���꣬Ȼ��ÿ��task����������ִ�н�����ǳɹ�����ʧ�ܣ������ʧ�ܣ�ԭ����ʲô��
//	Ȼ���ҾͿ��԰�����ʧ�ܵ�ԭ���ۺ��������������ߡ�
//	3��submit����Exception����
//	��˼��������������task����׳�checked����unchecked exception��
//	������ϣ������ĵ������ܹ���֪��Щexception��������ʱ�Ĵ�����ô����Ҫ�õ�submit��ͨ������Future.get�׳����쳣��
	public static void main(String[] args) {
		 ExecutorService pool = Executors.newFixedThreadPool(2);    
	        /**
	         * execute(Runnable x) û�з���ֵ������ִ�����񣬵��޷��ж������Ƿ�ɹ���ɡ�
	         */
	        pool.execute(new RunnableTest("Task1")); 
	        
	        /**
	         * submit(Runnable x) ����һ��future�����������future���ж������Ƿ�ɹ���ɡ��뿴���棺
	         */
	        @SuppressWarnings("rawtypes")
			Future future = pool.submit(new RunnableTest("Task2"));
	        
	        try {
	            if(future.get()==null){//���Future's get����null���������
	                System.out.println("�������");
	            }
	        } catch (InterruptedException e) {
	        } catch (ExecutionException e) {
	            //�������ǿ��Կ�������ʧ�ܵ�ԭ����ʲô
	            System.out.println(e.getCause().getMessage());
	        }

	}

}
