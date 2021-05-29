package com.huida.thread;

public class SellTicketsTest {
	public static void main(String[] args) {
		SellTickets st=new SellTickets();
		Thread t=new Thread(st);
		Thread t2=new Thread(st);
		Thread t3=new Thread(st);
		t.start();
		t2.start();
		t3.start();
	}

}
