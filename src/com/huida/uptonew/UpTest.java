package com.huida.uptonew;
/**
 * ��������
 * ֮����
 * @author WYN
 *
 */
public class UpTest {
	public static void main(String[] args) {
		Man man=new Man();
		Woman woman=new Woman();
		NoManNoWoman nmnw=new NoManNoWoman();
		//chi(woman);
		chi(nmnw);
	}
	public static void chi(Person person){
		person.eat();
	}
}
