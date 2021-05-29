package com.huida.thread;


public class ThreadTest1 {
	public static void main(String[] args) {
		ThreadTest1 tt=new ThreadTest1();
		First first=tt.new First();
		Thread t=new Thread(first);
		Second second=tt.new Second();
		Thread t2=new Thread(second);
		t.start();
		t2.start();
	}
	public void first(){
	//public synchronized void  first(){
		for(int i=0;i<4;i++){
			System.out.println("1111");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public void second(){
	//public synchronized void second(){
		for(int i=0;i<4;i++){
			System.out.println("0000");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
class First implements Runnable{
	public void run(){
		first();
	}
}
	class Second implements Runnable{
		public void run(){
		second();
		}
}
}
