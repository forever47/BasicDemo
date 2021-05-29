package com.huida.param;

public class Demo3 {

	public static void main(String[] args) {
		Demo4 demo4=new Demo4();
		demo4.setId(4);
		int id=7;
		change(id,demo4);
		System.out.println("id: "+id);
		System.out.println("demo4.getId(): "+demo4.getId() );

	}
	public static void change(int id,Demo4 demo4){
		id=7;
		demo4.setId(7);
	}

}
