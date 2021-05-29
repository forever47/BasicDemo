package com.huida.equals;

public class TestUser {

	public static void main(String[] args) {
		User u=new User(2016,"XC");
		User u2=new User(2016,"XC");
		System.out.println(u.equals(u2));//true
		System.out.println(u==u2);//false
	}

}
