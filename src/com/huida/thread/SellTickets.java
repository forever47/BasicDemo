package com.huida.thread;

public class SellTickets implements Runnable {
	
	int tickets=49;
	Object object=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(object){
			while(true){
			if(tickets>0){
				System.out.println("��ǰ��������"+(tickets--)+"��Ʊ");
			}
		}
		}
	}
}
